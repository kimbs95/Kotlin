package com.example.test3

fun main(){
    val name ="홍길동"
    val email="hong@example.kr"

    add2(name)
    add2(name ,email)
    add2("둘리","dooly@example.kr")
//    =====================
    defaultArgs()
    defaultArgs(200)
//    =========================

    namedParam(x=200, z=100)
    namedParam(z=150)


}
fun add2(name :String, email:String="default"){
    val output = "${name} 님의 이메일은 ${email}입니다"
    println(output)
}
fun defaultArgs(x:Int = 100 , y :Int =200){
    println(x+y)
}
fun namedParam(x:Int =100 , y:Int =200 , z:Int){
    println(x+y+z)
}
