package com.riya;
public class Riya{
    private String name;
    private int age;

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("the age has been updated");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("the name has been updated");
    }
    protected static void show(){
        System.out.println("protected method");
    }
}
