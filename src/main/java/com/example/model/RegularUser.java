package com.example.model;

public class RegularUser extends User {
    public RegularUser(String username, String password) {
        super(username, password);
    }

    @Override
    public void displayMenu() {
        System.out.println("==== 쇼핑 메뉴 ====");
        System.out.println("1. 장바구니에 옷 추가");
        System.out.println("2. 장바구니에서 옷 제거");
        System.out.println("3. 결제하기");
        System.out.println("4. 포인트 충전");
    }
}
