package coreJavaPart2.inheritanceDemo;

public class Dog extends Animal{
    String text="Hello, I am a dog";

    public void display(){
        System.out.println(text);
    }

    public void displayName(){
        System.out.println("The dog name is "+name);
    }

}
