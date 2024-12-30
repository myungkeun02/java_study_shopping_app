package com.example.app;

import com.example.service.LoginService;

public class Main {
    public static void main(String[] args) {
        LoginService loginService = new LoginService();
        loginService.login();
    }
}