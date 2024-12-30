package com.example.service;

import com.example.dao.UserDAO;
import com.example.model.User;

import java.util.Scanner;

public class LoginService {
    private UserDAO userDAO;

    public LoginService() {
        this.userDAO = new UserDAO();
    }

    public User login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("아이디를 입력하세요: ");
        String username = scanner.nextLine();
        System.out.println("비밀번호를 입력하세요: ");
        String password = scanner.nextLine();

        User user = userDAO.findUserByUsername(username);

        if (user != null && user.checkPassword(password)) {
            System.out.println("로그인 성공");
            return user;
        } else {
            System.out.println("로그인 실패 : 아이디 또는 비밀번호가 틀렸습니다.");
            return null;
        }
    }
}
