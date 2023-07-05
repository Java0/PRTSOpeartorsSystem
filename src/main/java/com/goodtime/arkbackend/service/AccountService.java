package com.goodtime.arkbackend.service;


import com.goodtime.arkbackend.entity.OperatorAccount;
import com.goodtime.arkbackend.entity.OperatorArchive;
import com.goodtime.arkbackend.entity.OperatorExam;
import com.goodtime.arkbackend.entity.OperatorInfo;
import com.goodtime.arkbackend.mapper.OperatorAccountMapper;
import com.goodtime.arkbackend.mapper.OperatorArchiveMapper;
import com.goodtime.arkbackend.mapper.OperatorExamMapper;
import com.goodtime.arkbackend.mapper.OperatorInfoMapper;
import com.goodtime.arkbackend.service.util.Utils;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;


@Service
@Transactional(propagation = Propagation.REQUIRED)
public class AccountService {

    @Autowired
    OperatorAccountMapper operatorAccountMapper;

    @Autowired
    OperatorInfoMapper operatorInfoMapper;

    @Autowired
    OperatorExamMapper operatorExamMapper;

    @Autowired
    OperatorArchiveMapper operatorArchiveMapper;

    public boolean checkLoginState(String id,  String identificationCode){
        String ic = operatorAccountMapper.getIdentificationCodeById(id);

        if(ic == null) return false;

        return ic.equals(identificationCode);
    }

    public Map<String, String> register(String name, String password, String sex, String avatar, String compressedAvatar){
        Map<String, String> resContent = new HashMap<>();
        String id = operatorAccountMapper.getAccountIdByName(name);
        if(id == null){
            int defaultAuthority = 1;
            String uuid = Utils.getUUID();
            String identificationCode = Utils.getMd5(uuid, password, String.valueOf(defaultAuthority));

            OperatorAccount account = new OperatorAccount(uuid, name, password, defaultAuthority, avatar, compressedAvatar, identificationCode);
            operatorAccountMapper.insert(account);

            OperatorInfo info = new OperatorInfo(uuid, sex);
            operatorInfoMapper.insert(info);

            OperatorExam exam = new OperatorExam(uuid);
            operatorExamMapper.insert(exam);

            OperatorArchive archive = new OperatorArchive(uuid, 1);
            operatorArchiveMapper.insert(archive);

            resContent.put("state", "success");
            resContent.put("description", "注册成功，即将跳转至登录页");
            return resContent;
        }else {
            resContent.put("state", "failed");
            resContent.put("description", "干员【"+name+"】档案已存在");
            return resContent;
        }
    }

    public Map<String, Object> login(String name, String password, Boolean remember, HttpServletRequest request, HttpServletResponse response){
        Map<String, Object> resContent = new HashMap<>();
        OperatorAccount account = operatorAccountMapper.getAccountByName(name);

        if(account != null && account.getPassword().equals(password)){

            Integer order = account.getOrder();
            String id = account.getId();
            Integer authority = account.getAuthority();

            String maxAge = remember ? request.getServletContext().getInitParameter("cookie-max-age") : "-1";

            resContent.put("order", order);
            resContent.put("id", id);
            resContent.put("authority", authority);
            resContent.put("maxAge", maxAge);
            resContent.put("state", "success");
            resContent.put("description", "登录成功，即将跳转至首页");

        }else {
            resContent.put("state", "failed");
            resContent.put("description", "登录失败，请检查代号或密码是否正确");
        }

        return resContent;
    }


    public int getAccountsCount() {
        return operatorAccountMapper.getOperatorsCount();
    }

    public String getAvatar(String name){
        return operatorAccountMapper.getAvatarByName(name);
    }

}
