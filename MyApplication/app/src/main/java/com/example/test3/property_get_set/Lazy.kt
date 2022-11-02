package com.example.test3.property_get_set

//lazy 는 by lazy 가  실행 된후 lazy 가  실행될수있음
//Lazy val 만 사용가능 값변경 불가 읽기전용

class Person5(val name :String , val age :Int)
fun main(){
    var isPersonInstantiated : Boolean = false // 초기화 확인용도

    val person5 : Person5 by lazy{
        isPersonInstantiated = true
        Person5("Kim" ,23)
    }
    val personDelegate =lazy {Person5("Hong" ,40)} // 위임 변수를 사용해 초기화

    println("person5 Init : $isPersonInstantiated")
    println("personDelegate Init :${personDelegate.isInitialized()}")

    println("person5.name = ${person5.name}") // 이 시점에서 초기화
    println("personDelegate.value.name = ${personDelegate.value.name}") // 이시점에서 초기화

    println("person5 Init :$isPersonInstantiated")
    println("personDelegate Init : ${personDelegate.isInitialized()}")
}