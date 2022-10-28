package com.example.test3


//조건문 when
fun when1(){
    var dat =10
    when(dat){
        10 -> println("data is 10 ")
        20 -> println("data is 20")
        else ->{
            println("data is not valid data")
        }
    }
}
fun when2(){
    var x =10
    when(x){

        in 1..10 -> print("x는 1이상 10이하 입니다.")
        !in 10 ..20 -> print("x 는 10이상 20 이하가 아닙니다.")
        else -> print("x는 어떤 범위에도 없습니다.")
    }
//    ============================
    val  str = "안녕하세요"
    val result = when(str){
        is String -> "문자열입니다."
        else ->false
    }
}
//=========================================
//  for (i in 1..10) { ... } → 1부터 10까지 반복
//  for (i in 1 until 10) { ... } → 1부터 9까지 반복(10은 미포함)
//  for (i in 2..10 step 2) { ... } → 2부터 10까지 2씩 증가
//  for (i in 10 downTo 1) { ... } → 10부터 1까지 1씩 감소


//
fun main(){
//    인자가 있는 when
//    print("Enter the score: ")
//    val score =readLine()!!.toDouble()
//    var grade: Char = 'F'
//    when(score) {
//        in 90.0..100.0 -> grade='A'
//        in 80.0..89.0 -> grade='B'
//        in 70.0..7900.0 -> grade='C'
//        !in 70.0..100.0 -> grade='F'
//    }
//    println("Score: $score, Grade : $grade")

//      인자가 없는 when
        print("Enter the score: ")
        val score =readLine()!!.toDouble()
        var grade: Char = 'F'
        when {
           score >= 90.0 -> grade='A'
           score in 80.0..89.0 -> grade='B'
           score in 70.0..7900.0 -> grade='C'
           score < 70.0 -> grade='F'
    }
    println("Score: $score, Grade : $grade")

println("=================================")
//   다양한 자료형의 인자 받기
    cases("Hello") //String
    cases(1) //Int
    cases(System.currentTimeMillis()) //Long
    cases(Myclass()) //객체
}
//자료형인자 받기
fun cases(obj :Any){
    when(obj){
        1-> println("Int:$obj")
        "Hello" ->println("String:$obj")
        is Long -> println("Long : $obj")
        !is String -> println("Not a String")
        else -> println("Unknow")
    }
}
class Myclass