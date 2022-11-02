package com.example.test3.classs

internal class InternalClass{
//    internal 공동의  public 종류
    internal var i =1
    internal fun icFunc(){
        i += 1
    }
    fun access(){
        icFunc()
    }
}
class Other{
    internal val ic = InternalClass()
    fun test(){
        ic.i
        ic.icFunc()
    }
}
fun main() {
    val mic = InternalClass()
    mic.i
    mic.icFunc()
}