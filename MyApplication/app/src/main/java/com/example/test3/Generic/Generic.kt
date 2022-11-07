package com.example.test3.variable

class Box<T>(t:T){
    var name =t
}
fun main(){
    val box1: Box<Int> = Box<Int>(1)
    val box2: Box<String> = Box<String>("Hello")
    println(box1.name)
    println(box2.name)
    println("================================")
    println("자료형 변환하기")
    val obj1 :Parent =Child()// Parent 형식의 obj1 은 Child 로 형변환

//    val obj2 :Child =Parent()
//    val obj3 :Cup<Parent> = Cup<Child>()
//    val obj4: Cup<Child> =Cup<Parent>()

    val obj5 =Cup<Child>() // obj5 는 Cup<Child>형식이 됨
    val obj6:Cup<Child> =obj5 // 형식이 일치하므로 ok!

    val obj = GenericNull<String>()
    obj.EqualityFunc("Hello" , "World")

    val obj22 = GenericNull<Int?>()
    obj22.EqualityFunc(null ,10 )


}
//제네릭 클래스의 자료형 형변환하기
open class Parent
class Child :Parent()
class Cup<T>


//제네릭의 형식 매개변수는 기본적으로 null 가능한 형태로 선언
class GenericNull<T>{
    fun EqualityFunc(arg1:T ,arg2:T){
        println(arg1?.equals(arg2))
    }
}


