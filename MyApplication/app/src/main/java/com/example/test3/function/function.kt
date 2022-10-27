package com.example.test3

//함수 선언 형식
fun a( a: Int ): Int {
    println(a)
    return a
}

//반환 타입이 있는 함수 선언
fun some(data :Int ):Int{
    return data * 10
}
//매개 변수값 변경 오류
fun some1(data1 : Int){
//    data1 = 20 //매개 변수는 자동으로 val 로 와서 변경 불가능
}

// 일반 함수선언 하기
fun sum(a:Int , b:Int): Int{
    return a+b
}
//간략화된 함수
fun sum1(a:Int ,b:Int) :Int = a+b

//반환 자료형 생략
fun sum2(a:Int , b:Int) = a+b

//일반적인 함수사용
fun add(name :String, email:String ){
        //name 과 email 을 회원 목록에 저장
}
fun add1(name:String , email:String = "default"){

}
// 가변적인 매개변수 받기
fun print3Numbers(num1:Int , num2:Int,num3:Int){
    //num1 ,num2 ,num3 을 각각 출력
}
fun print4Numbers(num1:Int ,num2:Int,num3:Int,num4:Int){
    //num1 ,num2 ,num3,num4 을 각각 출력

}
//매개 변수의 개수가 고정되어있지 않은 함수( vararg = 가변인수)
fun normalVarargs(vararg counts:Int){
    for(num in counts){
        println("$num")
    }
    println()
}

fun main(){
   normalVarargs(1,2,3,4) // 4개의 인자 구성
   normalVarargs(1,2,3) // 3개의 인자 구성
}