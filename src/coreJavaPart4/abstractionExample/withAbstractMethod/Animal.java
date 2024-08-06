package coreJavaPart4.abstractionExample.withAbstractMethod;

public abstract class Animal {
    //declare an abstract method
    abstract void makeSound();

    //declare a normal method
    public void eat(){
        System.out.println("Animals can eat");
    }
}
