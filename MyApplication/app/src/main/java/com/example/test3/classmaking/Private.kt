package com.example.test3.classmaking

private class PrivateClass{
    private var i = 1
    private fun privateFunc(){
        println("$i")
        i +=1 // 접근허용
        println("$i")
    }
    fun access(){
        privateFunc() // 접근허용
    }
}
class OtherClass{
//    val opc = PrivateClass() // 불가 - 프로퍼티 opc 는 private 이 되야 함
    //class 최상위에서는 private class 호출 불가
    fun test(){
        val pc = PrivateClass() // 생성 가능
    }
}
fun main(){
    val pc =PrivateClass() // 메서드 안에서는 private 생성가능
   // pc.i // 불가
    //pc.privateFunc() // 불가

    //문제 ) 2랑 필드 출력
    val j = pc.access()



}
fun TopFunction(){
    val tpc = PrivateClass() // 객체 생성가능
}