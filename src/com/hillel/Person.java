package com.hillel;

public class Person {
    String name;
    int grade;

    public Person(){
        System.out.println("Person empty constructor");
    }

    public Person(String name){
        this.name = name;
        System.out.println("Person not empry costrucrot");

    }
}
