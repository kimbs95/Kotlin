package com.example.test3.kotlienjava.javakotlien;

public class KCustomerAccess {
    public static void main(String[] args){
        //코틀린 클래스의 컴패니언 객체를 접근
        System.out.println(KCustomer.LEVEL);
        KCustomer.login();//어노테이션 을 사용할때 접근방법
        KCustomer.Companion.login();
    }
}
