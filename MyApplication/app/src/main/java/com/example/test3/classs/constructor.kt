package com.example.test3.classs

class Bird1{//constructor 주 생성자(Primary Constructor)
// class 명 뒤에 constructor 가 원래는 있음음
    // 프로퍼티만 선언
    var name : String
    var wing : Int
    var beak : String
    var color : String
//    부생성자 - 매개변수를 통해 초기화 (Secondary Constructor)
    constructor(name:String ,wing:Int, beak:String,color:String){
        this.name= name
        this.wing=wing
        this.beak=beak
        this.color=color
    }
    //메서드
    fun fly() = println("Fly wing : $wing")
    fun sing(vol :Int) = println("Sing vol :$vol")

// 부 생성자 여러개 설정
//  this 키워드를 생략하고 사용하는 경우
//    생성자의 매개변수와 프로포터의 이름을 다르게 구성 "_언더바"로 이름을 체크해줌
    constructor( _name :String ,_beak :String ){
        name = _name
        wing =2
        beak = _beak
        color="grey"
    }
}


fun main(){
    val coco = Bird1("mybird",3,"Short","blue")
    println("coco.color : ${coco.color}")
    coco.fly()
    coco.sing(3)
}

