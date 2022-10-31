package com.example.test3.exception

class InvalidNameException(message:String) :Exception(message)

fun main(){
    var name = "kildong123"
    try{
        validateName(name)
    }catch (e : InvalidNameException){ // 숫자가 포함되어 예외
        println(e.message)
    }catch(e: Exception){// 기타 예외
        println(e.message)
    }
}
fun validateName(name:String){
    if(name.matches(Regex(".*\\d+.*"))){ // 이름에 숫자가 포함되면 예외 던짐
        throw InvalidNameException("Your name :$name :contains numerals.")
    }
}