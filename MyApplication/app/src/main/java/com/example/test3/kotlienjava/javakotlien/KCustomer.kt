package com.example.test3.kotlienjava.javakotlien

class KCustomer {
    companion object{
        const val LEVEL ="INTERMEDIATE"
        @JvmStatic fun login() =println("Login....")
        //JvmStatic 자바에서 코틀린의 컴패니언 객체 접근하기 위한 어노테이션
    }
}