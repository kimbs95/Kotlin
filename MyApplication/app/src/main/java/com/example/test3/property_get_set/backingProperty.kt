package com.example.test3.property_get_set

class User4(id:Int , name :String ,age:Int){
    val id:Int =id
    private var tempName:String? = null
    var name :String = name
    get(){
        if(tempName == null) tempName = "NONAME"
        return tempName ?: throw AssertionError("Asserted by others")
//        tempName 에 값이 없으면 throw
    }
    var age:Int =age
}
fun main(){
    val user4 =User4(1, "kildong",35)
    user4.name =""
    println("user4.name = ${user4.name}")
}