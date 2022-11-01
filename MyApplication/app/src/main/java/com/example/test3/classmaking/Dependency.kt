package com.example.test3.classmaking

class Patient1(val name:String , var id: Int){
    fun doctorList(d:Doctor){
        println("Patient: $name ,Doctor : ${d.name}")
    }
}
class Doctor1(val name:String, val p:Patient1){
    val customerId : Int = p.id
    fun patientList(){
        println("Doctor1 : $name ,Patient1: ${p.name}")
        println("Patient Id : $customerId")
    }
}
fun main(){
    val patient1 =Patient1("kildong",1234)
    val doc1 =Doctor1("KimSabu",patient1)
    doc1.patientList()
}