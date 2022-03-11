package com.spartaglobal.gm.Oops;

public abstract class Animal {
    private String name;
    private String breed;
    private int age;



    public Animal(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public String setAge(int age) {
        if(age<=0){
            return "Age can only be positive!!";
        }else {
            this.age = age;
            return "Age updated to " + this.age;
        }
    }


    public String speak(){
        return "Animal is speaking";
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }
}
