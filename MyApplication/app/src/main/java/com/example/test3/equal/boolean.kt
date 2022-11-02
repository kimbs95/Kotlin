package com.example.test3

fun main(){
    val a:Int =1
    //val b:Double = a // 자료형 불일치 오류
    //val c:Int = 1.1 //자료형 불일치 오류

//   자료형변환
    val b: Double = a.toDouble()
    val result =1L +3 //Long + Int => result 는 Long

//   변환 메서드의 종류

//    toByte: Byte
//    toLong :Long
//    toShort:Short
//    toFloat: Float
//    toInt :Int
//    toDouble:Double
//    toChar : Char

//    이중등호 (==) : 값 만 비교
//    상중등호(===) : 값과 주소 둘다 비교

    val c:Int =128
    val d:Int =128
    println("c == d ${c == d}") //true
    println("c === d ${c === d}") //true

//    참조 주소가 달라지는 경우
    val e:Int =128
    val f:Int? = 128
    // ?  null 이 허용되는것은 객체를 항상 새로만들어서 저장
    println(e == f) // true
    println("e===f ${e === f}") //false

    val g:Int =128
    val h =g

    println(g === h)  // 자료형 기본 int 되어 동일
    val aa:Int? =g
    val bb:Int? =g
    val cc:Int? = aa
    println("aa == bb ${aa == bb}")
    println("aa === bb ${aa === bb}")
    println("aa === cc ${aa === cc}")


}