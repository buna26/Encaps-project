package com.buna;
import com.riya.*;

public class Buna extends Riya{
    public static void main(String[] args) {
        Riya obj = new Riya();
        obj.setName("Riya Das");
        obj.setAge(20);
        System.out.println(obj.getAge()+" "+obj.getName());

        Riya.show();
    }
}

