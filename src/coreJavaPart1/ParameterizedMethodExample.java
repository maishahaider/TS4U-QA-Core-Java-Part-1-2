package coreJavaPart1;

public class ParameterizedMethodExample {

    static int addMyNum(int firstNum, int secondNum){
        return firstNum+secondNum;
    }
    public static void main(String[] args) {
        System.out.println(addMyNum(20,34));
        System.out.println(addMyNum(24,34));
    }
}
