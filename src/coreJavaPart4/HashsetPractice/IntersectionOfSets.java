package coreJavaPart4.HashsetPractice;

import java.util.HashSet;

public class IntersectionOfSets {
    public static void main(String[] args) {
        HashSet<Integer> primeNumbers= new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        primeNumbers.add(8);

        System.out.println("The prime numbers are: "+primeNumbers);
        //create another set

        HashSet<Integer> evenNumbers=new HashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(8);
        evenNumbers.add(10);
        System.out.println("The even numbers are: "+evenNumbers);

        evenNumbers.retainAll(primeNumbers);
        System.out.println("After retaining: "+evenNumbers);
    }
}
