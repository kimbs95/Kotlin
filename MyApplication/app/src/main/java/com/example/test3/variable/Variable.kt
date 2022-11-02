package com.example.test3

 fun main(){
//    var = 변수
//
//    val = 상수
//    상수는 생성시 값을 초기화 해줘야함


//    Any 는 모튼 타입이 가능 String , Int
    val data1: Any =10 
    val data2: Any ="hello"
    
    class User
    val data3: Any = User()
//    Unit 자바에서 void 반환값 없음
    val data4: Unit =Unit
    
    fun som():Unit{
        println(10+20)
    }
//  ==============================================
//    return 형이 없어 반환 안됨
    fun some(){
        println(10+20)
    }
//  ==============================================
//    null
    var str1 : String ="Hello Kotlin"
//    str1 = null //null 이 허용되지 않음
    println("str1: $str1")

    val a:Int? =null // ? 물음표를 붙여주면 null 허용
    val b:String? = null
    println("$a,$b")
//    ==============================================
//  if 문으로 null 상태 검사
    var str2 : String? = "Hello KKOtlin"
    str2 =null
//    조건식을 통해 null 상태 검사
    val len =if(str2 != null ) str2.length else -1
    println("str2: $str2 length:${len}")
//  ==============================================
//    세이프 콜과 엘비스 연산자를 활용해 null
    var str3 :String ? ="hello"
    str3 = null
    println("str3: $str3 length:${str3?.length?:-1}")




}
