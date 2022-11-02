package com.example.test3.classs

class extends {
//    상속 (inheritance)
//    open class 기반 클래스명은 ( 다른클래스가 상속가능한 상태가 됨)
//    class 파생 클래스명 : 기반 클래스명() // 기반 클래스 상속가능
}
//상속 가능한 클래스를 위해 open 사용
open class Bird7( var name :String ,var wing :Int , var beak :String , var color:String){
    fun fly() =println("Fly wing :$wing")
    fun sing(vol:Int) = println("Sing vol :$vol")
}
//주 생성자 상속 사용
class Lark(name:String, wing:Int, beak:String, color:String) : Bird7(name ,wing ,beak, color){
    fun singHitone() = println("Happy Song! $name") // 메소드 추가
}
//부 생성자 상속 사용
class Parrot : Bird7{
    val language:String
    constructor(name:String ,wing:Int, beak:String, color:String,language:String) :super(name,wing,beak,color){
        this.language= language
    }
    fun speak() =println("Speak ! $language")
}
fun main(){
    val coco =Bird7("myBird7" ,2, "short", "blue")
    val lark =Lark("myLark",3,"long","brown")
    val parrot= Parrot("myparrot",2,"shortLong","multiple","korean")
    println("coco: ${coco.name}, ${coco.wing} ,${coco.beak},${coco.color}")
    println("Lark:${lark.name} , ${lark.wing},${lark.beak},${lark.color}")
    println("Parrot :${parrot.name} ,${parrot.wing},${parrot.beak}.${parrot.color},${parrot.language}")
    lark.singHitone()
    parrot.speak()
    lark.fly()
}