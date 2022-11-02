package com.example.test3.property_get_set

//위임 (delegation)  by
//<var|val|property> 프로퍼티 혹은 클래스 이름 : 자료형 by 위임자


interface Car{
    fun go():String
    fun so() =println("gdgd")
}
class VanImpl(val power:String ):Car{
    override fun go() = "는 짐을 적재하며 $power  마력을 가집니다."
}
class SportImpl(val power :String ) :Car{
    override fun go() = "는 경주용에 사용되며 $power 마력을 가집니다."
}
class CarModel (val model :String, impl :Car) : Car by impl{ // Car에 정의 되어있는것을 impl 이 다 잡아 먹고 impl을 사용할수 있도록 해준다
    fun carInfo(){
        println("$model ${go()}") //참조 없이 각 인터페이스 구현클래스의 go를 접근
    }
}
fun main(){
    val myDamas =CarModel("Damas 2010" , VanImpl("100마력"))
    val my350z = CarModel("350z 2008" , SportImpl("350마력"))

    myDamas.carInfo() // carInfo 에 대한 다형성을 나타냄
    my350z.carInfo()
    my350z.so()
}