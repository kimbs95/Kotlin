package com.example.test3.Generic

// 형식 매개변수로 선언된 함수의 매개변수를 연산할 경우
//fun <T> add(a:T,b:T):T{
//    return a + b // 오류 자료형을 아직 결정할수없음
//}


//자료형을 숫자형으로 제한하기
class Calc4<T :Number>{
    fun plus (arg1: T, arg2: T):Double{
        return arg1.toDouble() + arg2.toDouble()
    }
}
fun main(args:Array<String>){
    val calc =Calc4<Int>()
    println(calc.plus(10,20))

    val calc2 =Calc4<Double>()
    val calc3 = Calc4<Long>()
    //val calc4 = Calc4<String>() // 제한된 자료형으로 인해 불가

    println(calc2.plus(2.5,3.5))
    println(calc3.plus(5L,10L))

}