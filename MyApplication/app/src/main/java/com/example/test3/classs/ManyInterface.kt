package com.example.test3.classs

interface Bird2{
    val wings: Int
    fun fly()
    fun jump() = println("bird jump!")
}
interface Horse{
    val maxSpeed:Int
    fun run()
    fun jump() = println("jump! , max speed :$maxSpeed")
}

class Pegasus:Bird2,Horse{
    override val wings:Int =2
    override val maxSpeed:Int =100
    override fun fly() = println("Fly!")
    override fun run() = println("Run!")
    override fun jump() {
        super<Horse>.jump()
        println("and Jump!")
    }
}

fun main(){
    val pegasus =Pegasus()
    var jump = pegasus.jump()
}