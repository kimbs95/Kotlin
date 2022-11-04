package com.example.test3.classs

//interface 에서는 프로퍼티에 값을 저장할수없음 하지만 get() 을 이욯해 구현가능
interface Pet1{
    var category: String
    val msgTags: String
    get() = "I'm your lovely pet!"

    fun feeding()
    fun patting(){
        println("Keep patting!")
    }
}
class Dog(override var category: String) :Pet1{
    override fun feeding(){
        println("Feed the cat a tuna can!")
    }
}
fun main(){
    val obj = Dog("small")
    println("Pet Message Tags : ${obj.msgTags}")
    obj.feeding()
    obj.patting()
}