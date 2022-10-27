package com.example.test3

fun main(){
    val num = 256
    val num1: Any  =12.2  //256

    if(num is Int){ //   num 이 int 형이니 ? 타입확인
        println(num)
    }else if (num !is Int){ //num 이 int 형이 아니니?
        println("Not a Int")
    }
}