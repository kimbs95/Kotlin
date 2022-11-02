package com.example.test3.property_get_set


//Lazy val 만 사용가능 값변경불가 읽기전용
// by lazy 의 모드
//SYNCHRONIZED 락을 사용해 단일 스레드만이 사용하는것을 보장(기본값)
//PUBLICCATION 여러 군데서 호출될수 있으나 처음 초기화된 후 반환값을 사용
//NONE 락을 사용하지 않기 때문에 빠르지만 다중 스레드가 접근할수있음
class Lazy{
    init{
        println("init block")
    }
    val subject by lazy{
        println("lazy initialized")// 첫 초기화 시작할때만 실행
        "Kotlin Programming" // 초기화 됨
    }
    fun flow(){
        println("not initialized")
        println("subject one :$subject") // 최초 초기화시점
        println("subject two :$subject")
    }
}
fun main(){
    val test = Lazy()
    test.flow()
}