package com.example.test3.property_get_set

object OCustomer{
    var name ="Kildong"
    fun greeting() = println("Hello World")
    val HOBBY = Hobby("Basketball")
    init{
        println("Init!!")
    }
}
class Hobby(val name:String)
fun main(){
    OCustomer.greeting() // 객체의 접근 시점(object 는 접근 시점에 생성된다)
    OCustomer.name ="Dooly"
    println("name = ${OCustomer.name}")
    println(OCustomer.HOBBY.name)
    println("=====================")
    val pretendedMan =object:Superman(){
        override fun fly() = println("I'm not a real superman . I can't fly!")
    }
}
open class Superman(){
    fun work() = println("Taking Photos")
    fun talk() = println("Talking with People")
    open fun fly() = println("Flying in the air ")
}

