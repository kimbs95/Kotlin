package com.example.test3.classs

class Bird { // 클래스 정의
    //  프로퍼티 (속성)
    var name : String ="Mybird"
    var wing : Int = 2
    var beak :String = " short"
    var color : String ="blue"
    //메서드 (함수)
    fun fly() = println("Fly wing :$wing")

    fun sing(vol:Int)= println("sing vol : $vol")
}
fun main(){
    val coco=Bird() // 객체 생성
    coco.color="red"
    println("coco.color : ${coco.color}")
    coco.fly()
    coco.sing(3)

}
