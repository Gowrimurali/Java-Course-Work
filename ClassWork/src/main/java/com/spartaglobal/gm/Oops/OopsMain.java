package com.spartaglobal.gm.Oops;

public class OopsMain {

    public static void main(String[] args) {
        //Cat felix = new Cat("Felix", "Mane Coon", 15);
        //Dog Peter = new Dog("Peter", "poodle", 3);
        //felix.setName("Bob");
        //System.out.println("Hello my name is " + felix.getName() + " :)");
        //felix.setAge(-10);
        //System.out.println(cat1);
        //felix.speak();
        //Peter.speak("Manish");

        String name = "";
        String breed = "Mane Coon";
        int age = 15;

        Cat cat1 = constructObject(name,breed,age);
        if(!(cat1.checkNameField(cat1.name))){
            cat1 = null;
        }

        System.out.println(cat1);


    }



    public static Cat constructObject (String name, String breed,int age){
        Cat cat1 = new Cat(name, breed, age);
        return cat1;
    }



}

/*
  if(testFields(name,breed,age)){
    }
  }
  public static boolean testFields(String name, String breed, int age) {
  if (name.length() == 0 || breed.length() == 0 || age == 0) {
     return false;
   } else {
   for (char character : name.toCharArray()) {
  if (!((character >= 'A' && character <= 'Z') || (character >= 'a' && character <= 'z'))) {
      return false;
    }
  }
  for (char character : breed.toCharArray()) {
   if (!((character >= 'A' && character <= 'Z') || (character >= 'a' && character <= 'z'))) {
         return false;
       }
     }
   }
     return true;
   }
  */

