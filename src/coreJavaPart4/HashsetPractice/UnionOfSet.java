package coreJavaPart4.HashsetPractice;

import java.util.HashSet;

public class UnionOfSet {
    public static void main(String[] args) {
        HashSet<Integer> evenNumber= new HashSet<>();
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        evenNumber.add(8);

        System.out.println("The even numbers are: "+evenNumber);

        //another hashset
        HashSet<Integer> numbers=new HashSet<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(12);
        numbers.add(14);

        numbers.addAll(evenNumber);
        System.out.println("After adding the even numbers: "+numbers);
    }
}
