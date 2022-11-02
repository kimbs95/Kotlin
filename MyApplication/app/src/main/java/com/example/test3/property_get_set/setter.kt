package com.example.test3.property_get_set

class User3(id : Int , name :String , age :Int){
    val id:Int =id
    var name :String =name
    set(value){
        println("The name was changed")
        field =value.toUpperCase()
    }
    var age: Int =age
}
fun main(){
    val user3 =User3(1,"kildong3" , 35)
    user3.name="coco"
    println("user3.name  =${user3.name}")
}