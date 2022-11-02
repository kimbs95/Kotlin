package com.example.test3.property_get_set

// 게터 세터 동작방식
class User1(_id : Int , _name :String , _age :Int) {
//    프로퍼티들
    val id :Int = _id //불변 (읽기 전용)
    var name:String = _name //변경가능
    var age :Int = _age
}

//간략화 한것
//class User(val id :Int , var name:String , var age:Int)

// 코틀린에서 게터와 세터 작동
fun main(){
    val user = User1(1,"sean",30)
//    게터에 의한 값 획득
     val name =user.name
//    세터에 의한 값 획득
    user.age =41
    println("name $name , ${user.age}")
}