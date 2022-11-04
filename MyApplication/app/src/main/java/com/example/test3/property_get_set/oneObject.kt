package com.example.test3.property_get_set

abstract class Printer{
    abstract fun print()
}
val myPrinter =object:Printer(){
    override fun print() {
        println("출력")
    }

}
fun main(){
    myPrinter.print()
}