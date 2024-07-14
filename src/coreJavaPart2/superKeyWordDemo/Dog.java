package coreJavaPart2.superKeyWordDemo;

import coreJavaPart2.inheritanceDemo.Animal;

public class Dog extends Animal {
    @Override
    public void eat(){
        super.eat();
        System.out.println("I eat dog food");
    }
}
