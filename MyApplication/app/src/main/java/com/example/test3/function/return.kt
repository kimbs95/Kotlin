package com.example.test3



//==============================라벨 사용 방법 =============================
fun inlineLambda(a:Int,b:Int ,out: (Int,Int) -> Unit){
    out(a,b)
}
fun retFunc(){
    println("명시적 라벨")
    inlineLambda(13,3) lit@{a,b -> // 랃다식 블록의 시작 부분 라벨(label)이름 지정
        val result = a + b
        if(result >10)return@lit // 반환
        println("result: $result")
    }
    println("end of retFunc") // 이부분 시작
}

fun main () {
    retFunc()
    retFunc1()

}

//암묵적 라벨 사용

fun  retFunc1(){
    println("암묵적 라벨")
    inlineLambda(13,3) { a, b ->
        val result = a+b
        if(result >10)return@inlineLambda
        println("result 암묵적 :$result")
    }
    println("end of retFunc")
}




