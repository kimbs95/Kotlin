package com.example.test3.function

fun main(){
    retFunc()
    retFunc2()
    retFunc3()
}
inline fun inlineLamda(a: Int , b:Int ,out:(Int,Int) -> Unit){
    out(a,b)
}
//inline
fun retFunc(){
    println("start of retfunc")
    inlineLamda(13,3){a,b->
        val result = a + b
        if(result >10 ) return
        println("result $result")
    }
    println("end of retFunc")

}
//inline 제거
fun retFunc2(){
    println("2 )start of retFunc")
    inlineLamda(13,3) lit@{a,b ->
        val result = a+b
        if(result >10) return@lit
        println("result : $result")
    }
    println("2 )end of retFunc")
}
//암묵적 라벨
fun retFunc3(){
    println("3 )start of retFunc")
    inlineLamda(13,3){a,b ->
        val result =a +b
        if(result >10 ) return@inlineLamda
        println("result $result")
    }
    println("3 )end of retFunc")
}