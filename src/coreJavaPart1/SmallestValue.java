package coreJavaPart1;

import java.util.Scanner;

public class SmallestValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.println("Enter The First Number");
         double firstNumber= scanner.nextDouble();

        System.out.println("Enter The Second Number");
        double secondNumber= scanner.nextDouble();

        System.out.println("Enter The Third Number");
        double thirdNumber = scanner.nextDouble();

        System.out.println("The smallest value is:"+ smallestValue(firstNumber,secondNumber,thirdNumber));

    }

    public static double smallestValue(double firstNumber, double secondNumber, double thirdNumber){
        return Math.min(Math.min(firstNumber,secondNumber),thirdNumber);
    }
}
