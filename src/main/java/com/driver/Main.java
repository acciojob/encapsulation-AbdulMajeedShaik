package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        obj.setName("Encapsulation");
        String ans = obj.getName();
        System.out.println(ans);
    }
}