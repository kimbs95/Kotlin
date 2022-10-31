package com.example.test3

fun main(){
    fun sum(no:Int):Int{
        var sum = 0
        for(i in 1..no){

            sum +=i

        }

    return sum
    }
    val name:String = "KBS"
    println("name = $name, sum =${sum(10)},plus:${10+20}")

//    피라미드 만들기
    print("피라미드 만들기")
    var a =readLine()!!.toInt()
    for(line in 1..a){
        for(i in 1..(a-line))print(" ")
        for(z in 1..line*2-1)print("*")
        println()
    }

//    점점 늘어나기
    print("점점 늘어나는거 만들기")
    var b =readLine()!!.toInt()
    for(line in 1..b){
        for(z in 1..line)print("*")
        println()
    }
}