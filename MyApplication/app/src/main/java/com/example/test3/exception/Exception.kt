package com.example.test3


//try{
//에외 발생 가능성 있는 문장
//}catch(e: 예외처리 클래스명){
//예외를 처리하기 위한 문장
//}finally{
//반드시 실행 되어야 하는 문장
//}

fun main(){
    val a= 6
    val b =0
    val c :Int
    try {
        c = a / b
//    }catch(e:Exception){
//          e.printStackTrace()// 스택의 추적
//        println("Exception is handled")
    }catch(e: ArithmeticException){ // 산술연산 에 대한 예외를 따로 특정해서 잡을때
        println("Exception is handled. ${e.message}")
    }finally{
        println("finally 블록은 반드시 항상 실행됨")
    }
println("==========================================")
    var amount = 600
    try {
        amount -= 100
        checkAmount(amount)
    }catch(e :Exception){
        println("throw 를 사용해 예외를 던짐")
        println(e.message)
    }

    println("amount: $amount")
    println("======================================")
}

//특정 조건에 따른 예외 발생
//throw Exception(message : String)

fun checkAmount(amount :Int){
    if(amount < 100)
        throw Exception("잔고가 $amount 으로 1000이하 입니다.")
}

