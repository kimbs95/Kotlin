package com.example.test3.classmaking

//오버로딩
//다양한 매개변수
// 기능은 같지만 인자만 다르게 받는

fun main(){
    val calc =Calc()
    println(calc.add(3,2))
    println(calc.add(3.2,1.3))
    println(calc.add(3,3,2))
    println(calc.add("Hello","World"))
}
class Calc{
    //다양한 매개 변수로 오버로딩된 메서드들
    fun add(x:Int,y:Int) = x + y
    fun add(x:Double,y:Double) = x + y
    fun add(x:Int,y:Int,z:Int) = x + y
    fun add(x:String,y:String) = x + y
}