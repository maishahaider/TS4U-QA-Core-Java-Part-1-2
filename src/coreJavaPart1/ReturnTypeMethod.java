package coreJavaPart1;

public class ReturnTypeMethod {

    int addNumbers(){
        int firstNum=23;
        int secondNum=34;
        int result= firstNum+secondNum;
        return result;
    }
    public static void main(String[] args) {
        ReturnTypeMethod returnTypeMethod= new ReturnTypeMethod();
        System.out.println(returnTypeMethod.addNumbers());
    }
}
