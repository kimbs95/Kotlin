package com.example.test3

fun main(){
//    배열을 이용할때 대괄호도 되고 Set , Get 도 가능
    val data1 : Array<Int> = Array(3,{0})
    data1[0] = 10
    data1[1] = 20
    data1.set(2,30)

    println( """" 
        array Size : ${data1.size}
        array data : ${data1[0]}, ${data1[1]},${data1.get(2)}
        
    """)
    arr()
}
fun arr(){
    //Array 를 사용하지 않고 IntArray, LongArray ... 로 배열 생성가능

    val data2: IntArray =IntArray(3,{0})
    val data3: BooleanArray =BooleanArray(3,{false})

    println("data2 $data2")
    println("data3 $data3")

//    arrayOf() 함수를 사용하면 배열 선언시 값을 초기화 할수있음
//    intArrayOf() ,longArray() ...

    val data4 = intArrayOf(10,20,30)
    val data5  = booleanArrayOf(true,true,false)

    println("data4 $data4")
    println("data5 $data5")
    println("data5 ${data5.size}")

//    제네릭 사용
    val data6 = arrayOf<Int>(10,20,30)
    println("data6 $data6")
    println("data6 ${data6.size}")
    println("data6 ${data6[1]}")
    println("data6 ${data6.get(2)}")

//    indices = 인덱스를 의미
//    data.indices

//    withIndex() = 인덱스 번호 와 실제 데이터를 함께 가져옴
//    ex)for((index , value ) in data.withIndex())


//    Set => setOf() "불변"
//    Set => MutableSet => mutableSetOf() "가변"

//    Map => mapOf() "불변"
//    Map => MutableMap => mutableMapOf() "가변"

//   List , Set ,Map
//    List => listOf()  "불변" (데이터 변경 불가능)
//    List => MutableList => mutableListOf() "가변" (데이터 변경 가능)
//불가변 리스트
    var list =listOf<Int>(10,20,30)
    println("""
        
       list : ${list[0]},${list.get(1)},${list.get(2)} 
    """)

//    가변 리스트 사용 예
    var mutableList = mutableListOf(10,20,30)
    mutableList.add(3,40)
    mutableList.set(0,50)

    println("""
        가변 list data: ${mutableList[1]},${mutableList.get(2)} 
    """)


//    Map Pair 로 값을 넣을 수있고 "key" to "value" 식으로도 가능
    var map =mapOf<String,String>(Pair("one","hello"), "two" to "world")
    println("""
       map data : ${map.get("one")} , ${map.get("two")} 
    """)
 }