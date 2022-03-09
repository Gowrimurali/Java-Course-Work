package com.spartaglobal.gm.Oops;

public abstract class Animal {
    String name;
    String breed;
    int age;



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

    public void setAge(int age) {
        this.age = age;
    }

    public static boolean checkNameField(String name){
        if (name.length() == 0) {
            return false;
        }else{
            for (char character : name.toCharArray()) {
                if (!((character >= 'A' && character <= 'Z') || (character >= 'a' && character <= 'z'))) {
                    return false;
                }
            }
        }
        return true;
    }


    public void speak(){
        System.out.println("Animal is speaking");
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
