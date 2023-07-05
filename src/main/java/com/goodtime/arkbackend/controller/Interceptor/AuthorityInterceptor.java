package com.goodtime.arkbackend.controller.Interceptor;

import com.goodtime.arkbackend.mapper.OperatorAccountMapper;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;

public class AuthorityInterceptor implements HandlerInterceptor {

    @Autowired
    OperatorAccountMapper operatorAccountMapper;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return false;
    }
}
