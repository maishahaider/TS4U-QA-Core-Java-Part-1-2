package coreJavaPart2;

public class IfElseIfExample {
    public static void main(String[] args) {
        int num=0;
        if (num>0){
            System.out.println("This is a positive number");
        } else if (num<0) {
            System.out.println("This is a negative number");

        }else if (num==0){
            System.out.println("The number is 0");
        }else {
            System.out.println("It's not a number");
        }
    }
}
