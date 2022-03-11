package com.spartaglobal.gm.Oops;

public class OopsMain {
    public static void main(String[] args) {

        Cat cat1 = constructCat("Felix","Maane Coone",3);
        Dog dog1 = constructDog("Peter", "poodle", 5);
    }
    public static Cat constructCat (String name, String breed,int age){
        Cat cat1 = new Cat(name, breed, age);
        return cat1;
    }
    public static Dog constructDog (String name, String breed,int age){
        Dog dog1 = new Dog(name, breed, age);
        return dog1;
    }
}


