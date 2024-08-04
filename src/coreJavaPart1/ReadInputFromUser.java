package coreJavaPart1;

import java.util.Scanner;
public class ReadInputFromUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The First Number");
        int firstNumber= scanner.nextInt();
        System.out.println("Enter The Second Number");
        int secondNumber= scanner.nextInt();
        System.out.println("Enter The Third Number");
        int thirdNumber=scanner.nextInt();

        int result= firstNumber+secondNumber+thirdNumber;
        System.out.println("The result is: "+result);
    }

}
