package com.goodtime.arkbackend.controller;

import com.goodtime.arkbackend.entity.BriefInfo;
import com.goodtime.arkbackend.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/manage")
public class ManageController {

    @Autowired
    ManageService manageService;

    @GetMapping("/getOperatorList")
    public List<BriefInfo> getOperatorList(Integer currentPage, Integer count){
        return manageService.getOperatorList(currentPage, count);
    }

    @GetMapping("/getOperatorListByName")
    public List<BriefInfo> getOperatorListByName(String name){
        return manageService.getOperatorListByName(name);
    }

    @GetMapping("/getOperatorListByProfession")
    public List<BriefInfo> getOperatorListByProfession(String profession){
        return manageService.getOperatorListByProfession(profession);
    }


}
