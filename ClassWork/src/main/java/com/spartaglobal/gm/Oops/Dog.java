package com.spartaglobal.gm.Oops;

public class Dog extends Animal{

    public Dog(String name, String breed, int age) {
        super(name, breed, age);
    }

    public void speak(String owner){
        System.out.println(this.getName() + " is speaking to "+ owner);

    }

}
