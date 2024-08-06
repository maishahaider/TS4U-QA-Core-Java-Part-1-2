package coreJavaPart4.abstractionExample.withAbstractMethod;

public class Dog extends Animal{

    String dogsName="Mimi";
    public void display(){
        System.out.println(dogsName);
    }
    public void makeSound() {
        System.out.println("Dog sounds like berk berk");
    }
}
