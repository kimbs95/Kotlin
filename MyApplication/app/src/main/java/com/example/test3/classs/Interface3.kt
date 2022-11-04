package com.example.test3.classs

interface Pet2{
    var category: String
    val msgTags:String
    get()="I'm your lovely pet!"

    fun feeding()
    fun patting(){
        println("Keep patting!")
    }
}
open class Animal (val name :String)

class Dog1(name:String , override var category:String) :Animal(name),Pet2{
    override fun feeding(){
        println("Feed the dog a bone")

    }
}

class Cat7(name:String ,override var category:String) :Animal(name),Pet2{
    override fun feeding(){
        println("Feed the cat a tuna can!")
    }
}


// ===============================================
class Master{
    fun playWithPet(dog: Dog1){
        println("Enjoy with my dog")


    }
    fun playWithPet(cat :Cat7){
        println("Enjoy with my cat.")
    }
}

fun main(){
    val master =Master()
    val dog =Dog1("Toto" , "Small")
    val cat = Cat7("Coco" ,"BigFat")
    master.playWithPet(dog)
    master.playWithPet(cat)
}