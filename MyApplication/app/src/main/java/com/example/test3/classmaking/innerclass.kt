package com.example.test3.classmaking

open class Base{
    open val x:Int =1
    open fun f() = println("Base Class f()")
}
class Child : Base(){
    override val x :Int = super.x +1
    override fun f() = println("Child Class f()")
    inner class Inside{
        fun f() = println("Inside Class f()")
        fun test(){
            f() //이너클래스 안의 f()
            Child().f() // child 클래스 안의 f()
            super@Child.f() // child의 상위 클래스 base 클래스의 f()
            println("[Inside] super@Child.x : ${super@Child.x}")
        }
    }
}
fun main(){
    val c1 = Child()
    c1.Inside().test() // inner클래스 Inside 의 메서드 test() 실행
}