package com.example.test3.property_get_set

class User2(id :Int, name :String, age:Int) {
//    프로퍼티
    val id:Int = id
    get() = field

    var name:String =name
    get() =field
    set(value) {
        field =value
    }

    var age:Int =age
    get() =field
    set(value){
        field =value
    }
}

fun main(){
    val user2 = User2(1 ,"kildong",30)
//    user2.id =2 // 에러 val 프로퍼티 상수
    user2.age =35
    println("user.age = ${user2.age}")
}