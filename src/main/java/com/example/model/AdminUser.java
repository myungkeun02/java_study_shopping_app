package com.example.model;

public class AdminUser extends User {
    public AdminUser(String username, String password) {
        super(username, password);
    }

    @Override
    public void displayMenu() {
        System.out.println("==== 관리자 메뉴 ====");
        System.out.println("1. 새 의류 추가");
        System.out.println("2. 의류 삭제");
        System.out.println("3. 가격 조정");
        System.out.println("4. 총 판매 금액 확인");
    }
}
