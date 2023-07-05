package com.goodtime.arkbackend.service;

import com.goodtime.arkbackend.entity.BriefInfo;
import com.goodtime.arkbackend.mapper.BriefInfoMapper;
import com.goodtime.arkbackend.mapper.OperatorAccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManageService {

    @Autowired
    OperatorAccountMapper operatorAccountMapper;

    @Autowired
    BriefInfoMapper briefInfoMapper;
    public List<BriefInfo> getOperatorList(Integer currentPage, Integer count){
        int index = (currentPage - 1) * count;
        return briefInfoMapper.getBriefInfoList(index, count);
    }

    public List<BriefInfo> getOperatorListByName(String name){
        return briefInfoMapper.getBriefInfoListByName(name);
    }

    public List<BriefInfo> getOperatorListByProfession(String profession){
        return briefInfoMapper.getBriefInfoListByProfession(profession);
    }


}
