package coreJavaPart2;

public class ConstructorExample {
    String firstName="Maisha";
    public ConstructorExample(){
        int number=10;
        System.out.println(firstName);
        System.out.println(number);
    }
    public ConstructorExample(String fName,String lName){
        System.out.println("First name: "+fName);
        System.out.println("Last name: "+lName);
    }

    public static void main(String[] args) {
        ConstructorExample constructorExample= new ConstructorExample();
        ConstructorExample constructorExample1= new ConstructorExample("Maisha","Haider");
    }
}
