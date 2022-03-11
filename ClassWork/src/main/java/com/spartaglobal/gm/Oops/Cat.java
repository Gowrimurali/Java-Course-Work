package com.spartaglobal.gm.Oops;

public class Cat extends Animal implements CheckFields {
    public Cat(String name, String breed, int age) {
        super(name, breed, age);

    }

    public void speak(){
        System.out.println("purrr");
    }

    @Override
    public Cat checkNameField(Cat cat) {
        if (cat.getName().length() == 0) {
            Cat cat1 = null;
            return cat1;
        }else{
            for (char character : cat.getName().toCharArray()) {
                if (!((character >= 'A' && character <= 'Z') || (character >= 'a' && character <= 'z'))) {
                    Cat cat1 = null;
                    return cat1;
                }
            }
        }
        return cat;
    }

}
