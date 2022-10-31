package com.example.test3.classmaking

class PrimaryConstructor { // 주 생성자
}
//주 생성자 선언
class Bird3 constructor(_name :String , _wing:Int ,_beak: String,_color:String){
//    프로퍼티  // this 를 사용 하지 않을 경우 _ 사용
    var name :String =_name
    var wing :Int = _wing
    var beak: String =_beak
    var color: String = _color

//    메서드
    fun fly() =println("Fly wing :$wing")
    fun sing(vol: Int)= println("Sing vol :$vol")

}

// constructor 생략

class Bird4 (_name:String, _wing:Int ,_beak:String,_color: String){
//    프로퍼티 선언
    var name :String =_name
    var wing :Int = _wing
    var beak :String = _beak
    var color:String =_color
}
//생성자 정의

class Bird5(var name:String ,var wing:Int , var beak :String,var color:String){

}

//초기화 블록
class Bird6(var name:String, var wing:Int ,var beak :String ,var color:String){
//    초기화 블록  (생성하면 바로 실행됨)
    init{
        println("=======초기화 블록 시작==========")
        println("이름은 $name ,부리는 $beak")
        this.sing(3)
        println("=========초기화 블록 끝 =========")
    }
//     메서드
    fun fly() = println("Fly wing :$wing")
    fun sing(vol:Int) = println("Sing vol:$vol")
}
fun main(){
    val coco= Bird5("bird" , 11,"long", "orange")
    println("coco.name : ${coco.name} ,coco.wing : ${coco.wing}")
    println("coco.color : ${coco.color} , coco.beak : ${coco.beak}")
    println("================================")
    val co =Bird6("KBS" , 2, "long" ,"red")
    println("================================")
    println("co.name :${co.name}, co.wing :${co.wing}")
    println("co.color:${co.color} ,co.beak: ${co.beak}")
}
