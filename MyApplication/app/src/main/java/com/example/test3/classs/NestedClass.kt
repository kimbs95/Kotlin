package com.example.test3.classs



//코틀린에서 중첩 클래스는 기본적으로 정적 클래스 처럼 다뤄짐
//static (정적) 은 호출로 사용 가능하다 .
class Outer{
    val ov = 5
    class Nested{
        val nv= 10
        fun greeting() ="[Nested] Hello ! $nv"
    }
    fun outside(){
        val msg =Nested().greeting()
        println("[Outer] :$msg , ${Nested().nv}")
    }
//    안에 있는 클래스 에서 밖에 있는거 사용하기
    class Inout{
        fun inout(){
            println(country)
            getSomething()
        }
    }

    companion object{
        const val country ="Korea"
        fun getSomething()= println("Get something....")
    }

}

fun main(){
    val output =Outer.Nested().greeting()
    println(output)

    val outer =Outer()
    outer.outside()
    println("=============================")
    println("in 에서 out 사용하기")
    println(Outer.Inout().inout())
}