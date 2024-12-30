package com.example.model;

public abstract class User {
    protected String username;
    protected String password;
    protected int points;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.points = 0;
    }

    public String getUsername() {
        return username;
    }

    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }

    public int getPoints() {
        return points;
    }

    public void addPoints(int amount) {
        if (this.points + amount > 2000000) {
            System.out.println("최대 포인트 한도를 초과할 수 없습니다. (2,000,000 point)");
        } else {
            this.points += amount;
            System.out.println(amount + "포인트가 충전되었습ㄴ디ㅏ. 현재 포인트: " + this.points);
        }
    }

    public abstract void displayMenu();
}
