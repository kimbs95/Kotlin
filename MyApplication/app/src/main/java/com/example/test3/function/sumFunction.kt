package com.example.test3


fun sum5( a:Int , b:Int): Int {

    var sum = a + b
    return sum
}
fun main(){
    val result1 = sum5(3,2)
    val result2 = sum5(6,7)
    println(result1)
    println(result2)



//    Max 값 Maxfunc.Kt
    val num1 =10
    val num2 =3
    val result:Int
    result =max(num1 ,num2)
    println("Max $result")
}
fun max(a:Int ,b:Int )=  if(a>b) a else b
