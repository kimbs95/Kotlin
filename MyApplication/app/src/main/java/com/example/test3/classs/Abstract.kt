package com.example.test3.classs

// 추상 클래스 추상메소드있는 클래스
//abstract(추상 메소드) = 자식 클래스에서 반드시 오버라이드를 해야 사용할수 있는것을말한다

abstract class Vehicle(val name: String, val color: String, val weight:Double){

    abstract var maxSpeed :Double

    var year = "2018"

    abstract fun start()
    abstract fun stop()

    fun displaySpecs(){
        println("Name: $name , Color :$color , Weight: $weight , Year: $year , Max Speed :$maxSpeed")
    }
}
class Car(name :String , color:String ,weight:Double , override var maxSpeed:Double):Vehicle(name,color,weight){
    override fun start(){
        println("Car Started")
    }
    override fun stop() {
        println("Car Stopped")
    }
}
class Motorcycle(name:String ,color :String, weight:Double ,override var maxSpeed:Double):Vehicle(name,color,weight){
    override fun start(){
        println("Bike Started")
    }
    override fun stop(){
        println("Bike Stopped")
    }
}

fun main(){
    val car =Car("superMatiz" ,"yellow" , 110.0 ,270.0)
    val motor =Motorcycle("DreamBike" ,"red ",173.0,100.0)

    car.year ="2022"

    car.displaySpecs()
    car.start()
    motor.displaySpecs()
    motor.start()
}