package com.example.test3.classs

//앵글 브라켓 (< >)

open class A{
    open fun f() = println("A class f()")
    fun a () = println("A Class a()")
}
interface B{ // 인터페이스 에는 기본적으로 open 이다
    fun f() =println("B inteface f()")
    fun b() = println("B Interface b()")
}
class C :A() ,B { // , 콤마를 사용해 클래스와 인터페이스를 지정
    override fun f() = println("C Class f()")
    fun test(){
        f()
        b()
        super<A>.f()
        super<B>.f()

    }
}
fun main(){
    val c = C()
    c.test()
}