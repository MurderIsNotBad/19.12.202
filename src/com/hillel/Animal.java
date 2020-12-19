package com.hillel;

public class Animal {
    String name;

    public void print(){
        System.out.println("class: " + this.getClass().getSimpleName());
        System.out.println("name: " + this.name);
    }
    public void say(){
        System.out.println("Animal says");
    }
}
