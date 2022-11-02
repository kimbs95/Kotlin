package com.example.test3.property_get_set

//컴패니언 객체는 실제 객체의 싱글톤 으로 정의
class Person6{//(var id :Int)
    var id:Int? = 0
    var name:String ="KBS"
    companion object{
        var language:String = "Korean"
        fun work(){
            println("working....")
        }
    }
}
fun main(){
    println(Person6.language) // 인스턴스를 생성하지 않고 기본값 사용
    Person6.language ="English" // 기본값 변견 가능
    println(Person6.language) // 변경된 내용 출력
    Person6.work()// 메서드 실행
}