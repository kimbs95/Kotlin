package com.example.test3

//Unit void 형 return 을 안해줌
fun printSum(a:Int ,b:Int): Any{
    println("sum of $a and $b is ${a + b}") // is ~이다
    return "${a+b} ggg"
}
fun printSum1(a:Int ,b:Int): Unit{
    println("sum of $a and $b is ${a + b}") // is ~이다
}
fun pritn(a:Int ,b:Int){
    println("sum of $a and $b is ${a+b}")
}
fun main(){
    var i=printSum(3,3)
    println(i)
    printSum1(2,5)

}
