package coreJavaPart1;

public class VariableExample {
    /* There are 3 types of variable
     *Static variable
     *instance/class variable
     *local variable
     */
    //        Declare an instantce variable
    String instanceVariable="This is an instance variable";
    // Declare a static variable
    static String staticVariable= "This is a static variable";




    public static void main(String[] args) {
        String localVariable= "This is a local variable";
        VariableExample variableExample= new VariableExample();
        System.out.println(variableExample.instanceVariable);
        System.out.println(staticVariable);
        System.out.println(localVariable);
    }

    public void display(){
        String anotherLocalVariable= "This is another local variable";
        System.out.println(anotherLocalVariable);
    }
}
