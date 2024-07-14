package coreJavaPart1;

public class CallTheVariable {
    public static void main(String[] args) {
//        create an object of the variable example class

        VariableExample variableExample= new VariableExample();
//        Call the instance variable

        System.out.println(variableExample.instanceVariable);

//        Call the static variable or class variable

        System.out.println(VariableExample.staticVariable);

    }
}
