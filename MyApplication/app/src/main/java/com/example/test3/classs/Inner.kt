package com.example.test3.classs

class Smartphone (val model:String){
    private val cpu ="Exynos"

    inner class ExternalStorage(val size:Int){
        fun getInfo() ="${model}: Installed on $cpu with ${size}Gb"

    }
}
    fun main(){
        val mySdcard =Smartphone("S7").ExternalStorage(32)
        println(mySdcard.getInfo())
    }
