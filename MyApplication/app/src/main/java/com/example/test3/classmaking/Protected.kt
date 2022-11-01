package com.example.test3.classmaking

open class Base1{ // 최상위 선언 클래스에는 protected 사용할수 없음
    //상속 받은 자만 사용가능
    protected var i =1
    protected fun protectedFunc(){
        i += 1 // 접근 허용
        println(i)
    }
    fun access(){
        println(i)
        protectedFunc() // 접근허용
    }
    protected class Nested // 내부 클래스에는 지시자 허용
}
class Derived :Base1(){
    fun test(base1: Base1): Int{
        protectedFunc() // Base 클래스의 메서드 접근가능
        return i //Base 클래스의 프로퍼티 접근 가능
    }
}
fun main(){
    val base =Base1()
//    base.i //접근불가
//    base.protectedFunc() // 접근불가
    base.access()
    //필드랑 함수 호출 해보기

}