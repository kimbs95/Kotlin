package com.example.test3

fun if1(){
    var a =1
    var b =2
    var max:Int
    if(a < b){
        max = b
    }else{
        max = a
    }
    val max1 =if(a > b) a else b
}
fun if2(){
    val a =12
    val b = 7
    val max = if (a >b){
        println("a 선택")
        a
    }else{
        println("b 선택")
        b
    }
    println(max)
}
fun elseif(){
    val number =0
    val result = if( number > 0 )
        "양수값 "
    else if(number < 0 )
        "음수값"
    else
        "0"
}
fun main(){
    print("Enter the score : ")//readLine()!! 스캐너 역학
    val score =readLine()!!.toDouble() // 콘솔로부터 입력 받음
    var grade : Char = 'F'
    if(score > 90.0){
        grade='A'
    }else if(score >= 80.0 && score <= 89.9){//score in 80.0..89.9
        grade='B'
    }else if(score >= 70.0 && score <=79.9){//score in 70.0..79.9
        grade='c'
    }
    println("Score: $score,Grade: $grade")

    var data = 10
    val result = if(data > 0){
        println("data > 0")
        true // 반환값
    }else{
        println("data <= 0")
        false
    }
    println(result)


}




