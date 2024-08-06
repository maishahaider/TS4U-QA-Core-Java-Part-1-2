package coreJavaPart4.abstractionExample.withAbstractMethod;

public class DisplayAll {
    public static void main(String[] args) {
        Dog dog= new Dog();
        dog.makeSound();
        dog.display();
        Cat cat=new Cat();
        cat.makeSound();
        cat.eat();
    }
}
