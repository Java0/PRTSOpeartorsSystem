package com.goodtime.arkbackend.controller;

import com.goodtime.arkbackend.entity.OperatorAccount;
import com.goodtime.arkbackend.entity.OperatorArchive;
import com.goodtime.arkbackend.entity.OperatorExam;
import com.goodtime.arkbackend.entity.OperatorInfo;
import com.goodtime.arkbackend.service.PersonalInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/info")
public class PersonalInfoController {

    @Autowired
    PersonalInfoService personalInfoService;


    @GetMapping("/getOperatorAccount")
    public OperatorAccount getOperatorAccount(String id){
        return personalInfoService.getOperatorAccount(id);
    }

    @GetMapping("/getAll")
    public Map<String, Object> getAll(String id){
        return personalInfoService.getAll(id);
    }

    @GetMapping("/getOperatorInfo")
    public OperatorInfo getOperatorInfo(String id){
        return personalInfoService.getOperatorInfo(id);
    }

    @GetMapping("/getOperatorExam")
    public OperatorExam getOperatorExam(String id){
        return personalInfoService.getOperatorExam(id);
    }

    @GetMapping("/getAllArchive")
    public List<OperatorArchive> getOperatorArchives(String id){
        return personalInfoService.getOperatorArchives(id);
    }

    @GetMapping("/getAvatar")
    public String getAvatar(String id){
        return personalInfoService.getAvatar(id);
    }

    @PostMapping("/changeAvatar")
    public Map<String, String> changeAvatar(@RequestBody Map<String, String> request){
        String id = request.get("id");
        String avatar = request.get("avatar");
        String compressedAvatar = request.get("compressedAvatar");
        return personalInfoService.changeAvatar(id, avatar, compressedAvatar);
    }

    @PostMapping("/changeAuthority")
    public Map<String, String> changeAuthority(@RequestBody Map<String, String> request){
        String id = request.get("id");
        int authority = Integer.parseInt(request.get("authority"));
        return personalInfoService.changeAuthority(id ,authority);
    }

    @PostMapping("/changeInfo")
    public Map<String, String> changeInfo(@RequestBody OperatorInfo operatorInfo){
        return personalInfoService.changeInfo(operatorInfo);
    }

    @PostMapping("changeExam")
    public Map<String, String> changeExam(@RequestBody OperatorExam operatorExam){
        return personalInfoService.changeExam(operatorExam);
    }

    @PostMapping("changeArchives")
    public Map<String, String> changeArchives(@RequestBody List<OperatorArchive> archives){
        return personalInfoService.changeArchives(archives);
    }
}
