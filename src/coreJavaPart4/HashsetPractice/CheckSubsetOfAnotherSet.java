package coreJavaPart4.HashsetPractice;

import java.util.HashSet;

public class CheckSubsetOfAnotherSet {
    public static void main(String[] args) {
        HashSet<Integer> numbers=new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(8);

        System.out.println("Numbers are:"+numbers);

        //another Hashset

        HashSet<Integer> primeNumbers=new HashSet<>();

        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);

        System.out.println("Prime numbers are: "+primeNumbers);
        Boolean result= numbers.containsAll(primeNumbers);
        System.out.println("Is The numbers contain prime Numbers? "+result);
    }
}
