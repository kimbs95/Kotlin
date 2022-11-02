package com.example.test3

fun main(){
    var n= 3
    if((n % 2 )== 1){//홀수
    println("$n is an Odd number")
    }
    if((n % 2)==0 ){// 짝수
    println("$n is an Even number")

    }
    var num1 = 10
    var num2 =10
    val result1 = ++num1
    val result2 = num2++

    println("result1 : $result1")
    println("result2 : $result2")
    println("num1 : $num1")
    println("num2 : $num2")
}
