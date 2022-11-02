package com.example.test3.classs

// 제정의

open class Bird8 { // open 은 상속 가능을 나타냄
    fun fly() {} // 최종 메서드로 오버라이드 불가
//    open fun sing{} // sing() 메서드는 하위 클래스에서 제정의 가능
}
class Lark1() :Bird8(){
//    fun fly() {}// 제정의 불가 Bird8 에서 open 을 안해줌
//    override fun sing(){ // 새롭게 제정의 가능
//  final override fun sing() // 하위클래스에서 제정의 불가능
//    }
}
// open 이 있기 때문에 상속이 가능
open class Bird9(var name:String , var wing:Int , var beak:String, var color:String){
    fun fly() =println("Fly wing $wing")
    open fun sing(vol:Int) = println("Sing vol $vol")// 오버라이드(제정의) 가능
}
class Parrot1(name:String ,wing:Int=2 , beak:String , color:String, var language:String ="natural" ) :Bird9(name,wing,beak,color){
    fun speak() =println("Speak! $language")
    override fun sing(vol :Int){
        println("I'm a parrot! The volume level is $vol")
        speak()
    }
}
fun main(){
    val parrot = Parrot1(name ="Myparrot" , beak = "short" , color ="mulitple")
    parrot.language ="English"
    println("Parrot: ${parrot.name} ,${parrot.wing}, ${parrot.beak} , ${parrot.color} , ${parrot.language}")
    parrot.sing(5)


}