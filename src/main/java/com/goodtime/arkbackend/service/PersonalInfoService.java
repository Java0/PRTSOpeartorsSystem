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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PersonalInfoService {

    @Autowired
    OperatorAccountMapper operatorAccountMapper;

    @Autowired
    OperatorInfoMapper operatorInfoMapper;

    @Autowired
    OperatorExamMapper operatorExamMapper;

    @Autowired
    OperatorArchiveMapper operatorArchiveMapper;


    public OperatorAccount getOperatorAccount(String id){
        return operatorAccountMapper.getAccountById(id);
    }

    public OperatorInfo getOperatorInfo(String id){
        return operatorInfoMapper.selectByID(id);
    }



    public OperatorExam getOperatorExam(String id){
        return operatorExamMapper.selectById(id);
    }

    public List<OperatorArchive> getOperatorArchives(String id){
        return operatorArchiveMapper.selectAllById(id);
    }

    public Map<String, Object> getAll(String id){
        Map<String, Object> resMap = new HashMap<>();
        resMap.put("operatorInfo", getOperatorInfo(id));
        resMap.put("operatorExam", getOperatorExam(id));
        resMap.put("operatorArchives", getOperatorArchives(id));
        return resMap;
    }

    public String getAvatar(String id){
        return operatorAccountMapper.getAvatarById(id);
    }

    public Map<String, String> changeAvatar(String id, String avatar, String compressedAvatar){
        Map<String, String> resContent = new HashMap<>();

        int changeResult = operatorAccountMapper.changeAvatar(id, avatar, compressedAvatar);

        if(changeResult > 0){
            resContent.put("state", "success");
            resContent.put("description", "信息已成功修改");
        }else {
            resContent.put("state", "failed");
            resContent.put("description", "信息修改失败");
        }
        return resContent;
    }

    public Map<String, String> changeAuthority(String id, int authority){
        boolean flag = false;
        Map<String, String> resContent = new HashMap<>();
        int changeResult = operatorAccountMapper.changeAuthorityById(id ,authority);
        if(changeResult > 0) {
            String pwd = operatorAccountMapper.getPasswordById(id);
            if (pwd!= null) {
                int i = operatorAccountMapper.changeIdentificationCodeById(id, Utils.getMd5(id, pwd, String.valueOf(authority)));
                flag = i > 0;
            }
        }

        if(flag){
            resContent.put("state", "success");
            resContent.put("description", "信息已成功修改");
        }else {
            resContent.put("state", "failed");
            resContent.put("description", "信息修改失败");
        }
        return resContent;
    }

    public Map<String, String> changeInfo(OperatorInfo operatorInfo){
        Map<String, String> resContent = new HashMap<>();

        System.out.println(operatorInfo);

        int changeResult = operatorInfoMapper.changeInfo(operatorInfo);

        if(changeResult > 0){
            resContent.put("state", "success");
            resContent.put("description", "信息已成功修改");
        }else {
            resContent.put("state", "failed");
            resContent.put("description", "信息修改失败");
        }
        return resContent;
    }

    public Map<String, String> changeExam(OperatorExam operatorExam){
        Map<String, String> resContent = new HashMap<>();

        int changeResult = operatorExamMapper.changeExam(operatorExam);

        if(changeResult > 0){
            resContent.put("state", "success");
            resContent.put("description", "信息已成功修改");
        }else {
            resContent.put("state", "failed");
            resContent.put("description", "信息修改失败");
        }
        return resContent;
    }

    public Map<String, String> changeArchives(List<OperatorArchive> archives){
        int count = 0;
        Map<String, String> resContent = new HashMap<>();
        for (OperatorArchive archive : archives) {
            OperatorArchive operatorArchive = operatorArchiveMapper.selectByIdAndOrder(archive.getId(), archive.getOrder());
            if(operatorArchive != null){
                count+=operatorArchiveMapper.changeArchiveByIdAndOrder(archive);
            }else {
                count+=operatorArchiveMapper.insert(archive);
            }
        }
        if(count > 0){
            resContent.put("state", "success");
            resContent.put("description", "信息已成功修改");
        }else {
            resContent.put("state", "failed");
            resContent.put("description", "信息修改失败");
        }

        return resContent;
    }


}
