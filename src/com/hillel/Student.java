package com.hillel;

public class Student extends Person{

    public Student(){

    }
    public Student(String name){
        super(name);
        System.out.println("Student constructor with name");
    }
    public Student(String name, int grade ){
        this.name = name;
        this.grade = grade;
        System.out.println("Student constructor with name and grade");
    }
}
