package com.hillel;

public class Main {

    public static void main(String[] args) {
	User user = new User("igor", "Vleen", 22);
        System.out.println(user);
        user.update("igor","Vleen", 22);
    }
}
