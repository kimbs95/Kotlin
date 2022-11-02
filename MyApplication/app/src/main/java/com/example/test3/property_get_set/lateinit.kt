package com.example.test3.property_get_set


//lateinit 은 var 만 사용가능

class Person3 {
    lateinit var name: String  // lateinit 늦은 초기화 선언
    fun test(){
        if(!::name.isInitialized){ // name프로퍼티 초기화 여부
            println("안되어있음")
        }else{
            println("되어있음")
        }
    }
}

data class Person4(var name:String ,var age:Int)
lateinit var person4 : Person4 // 객체 생성 지연초기화


fun main(){
    val kildong3 = Person3()
    kildong3.test()
    kildong3.name="Kildong" // 이 시점에서 초기화됨
    kildong3.test()
    println("name +${kildong3.name}")
    println("=============================")
    person4 = Person4("kildong" ,30)
    println(person4.name + "is" + person4.age.toString())



}
