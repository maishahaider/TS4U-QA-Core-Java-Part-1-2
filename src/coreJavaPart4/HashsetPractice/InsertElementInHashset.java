package coreJavaPart4.HashsetPractice;

import java.util.HashSet;

public class InsertElementInHashset {
    public static void main(String[] args) {
        //create an object of the hashset

        HashSet<Integer> evenNumber= new HashSet<>();

        //add numbers

        evenNumber.add(100);
        evenNumber.add(10);
        evenNumber.add(20);
        evenNumber.add(30);
        evenNumber.add(40);

        System.out.println("The even numbers are: "+evenNumber);

        //create another Hashset

        HashSet<Integer> numbers= new HashSet<>();
        numbers.addAll(evenNumber);
        numbers.add(150);
        numbers.add(200);

        System.out.println("The numbers are: "+numbers);
    }
}
