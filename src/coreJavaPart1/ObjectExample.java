package coreJavaPart1;

public class ObjectExample {
//    Declare two variables
    String name;
    int age;
//    Declare a constructor
    public  ObjectExample(String name, int age){
        this.name= name;
        this.age=age;
    }

//    Print the  value
    public void display(){
        System.out.println("Hello my name is: "+name+" and my age is: "+age);
    }
public static void main(String[] args) {
    ObjectExample objectExample= new ObjectExample("Maisha",25);
    ObjectExample objectExample1= new ObjectExample("John",34);
    objectExample.display();
    objectExample1.display();

}

}
