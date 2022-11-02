package com.example.test3.property_get_set;

class Person {
//        멤버 필드
    private String name;
    private int age;
//    생성자
//    자바는 자료형이 앞으로 나오고 코틀린은 자료형이 뒤에있다
    public Person(String name , int age){
        this.name= name;
        this.age =age;
    }
//    게터와 세터
    public String getName(){
        return  name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
}
