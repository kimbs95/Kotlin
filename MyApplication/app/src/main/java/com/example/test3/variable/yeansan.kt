package com.example.test3



//comparTo 빼기 함수
fun main(){
    var n= 3
    if((n % 2 )== 1){//홀수
    println("$n is an Odd number")
    }
    if((n % 2)==0 ){// 짝수
    println("$n is an Even number")

    }
    var num1 = 10
    var num2 =10
    val result1 = ++num1
    val result2 = num2++

    println("result1 : $result1")
    println("result2 : $result2")
    println("num1 : $num1")
    println("num2 : $num2")

    println("===========연산자의 작동방식=========================")
    println("오버로딩")
    val p1 = Point(3,-8)
    val p2 = Point(2,9)

    var point = Point()
    point = p1 + p2
    println("point = (${point.x} ,${point.y})")

    println("===========호출 연산자================")
    val manager = Manager()
    manager("Do something for me !")

    println("포함 범위 연산자")
    for(i in 1..4) println(i)

}
//연산자 오버로딩(operator) 키워드를 사용
//    연산자의 작동방식
class Point(var x:Int =0, var y:Int =10 ){
    operator fun plus (p:Point) :Point{
        return Point(x + p.x ,y + p.y)
    }
}
//호출 연산자
class Manager{
    operator fun invoke (value:String){
        println(value)
    }
}
