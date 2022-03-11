package com.spartaglobal.gm.Oops;

public class Dog extends Animal{

    public Dog(String name, String breed, int age) {
        super(name, breed, age);
    }

    public String speak(String owner){
        return this.getName().concat(" is speaking to ").concat(owner);
    }
}
