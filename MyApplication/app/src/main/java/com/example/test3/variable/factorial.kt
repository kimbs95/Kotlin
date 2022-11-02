package com.example.test3

fun main(){
//    factorial 은 자동으로 곱해줍니다.
    print("Enter the number : ")
    var number = readLine()!!.toInt()
    var factorial:Long = 1
    while(number > 0){
        factorial *= number
        --number
    }
    println("Factorial : $factorial")
    var a:Int? = 1;
    var b:Int? = 1;
    println("${a === b}")
}