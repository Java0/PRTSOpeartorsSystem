package com.goodtime.arkbackend.controller;

import com.goodtime.arkbackend.service.AccountService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    AccountService accountService;

    @PostMapping("/checkLoginState")
    public boolean checkLoginState(@RequestBody Map<String, String> request){
        String id = request.get("id");
        String identificationCode = request.get("identificationCode");
        return accountService.checkLoginState(id, identificationCode);
    }

    @PostMapping("/register")
    public Map<String, String> register(@RequestBody Map<String, String> registerReq){
        String name = registerReq.get("name");
        String password = registerReq.get("password");
        String sex = registerReq.get("sex");
        String avatar = registerReq.get("avatar");
        String compressedAvatar = registerReq.get("compressedAvatar");
        return accountService.register(name, password, sex, avatar, compressedAvatar);
    }

    @PostMapping("/login")
    public Map<String, Object> login(@RequestBody Map<String, String> loginReq, HttpServletRequest request, HttpServletResponse response){
        String name = loginReq.get("name");
        String password = loginReq.get("password");
        Boolean remember = Boolean.parseBoolean(loginReq.get("remember"));
        return  accountService.login(name, password, remember, request, response);
    }

    @GetMapping("/getAccountsCount")
    public int getAccountsCount(){
        return accountService.getAccountsCount();
    }

    @GetMapping("/getAvatar")
    public String getAvatar(String name){
        return accountService.getAvatar(name);
    }

}
