package coreJavaPart4.HashsetPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class AccessHashsetElements {
    public static void main(String[] args) {
        //create a hashset
        HashSet<Integer> numbers= new HashSet<>();
        numbers.add(1);
        numbers.add(9);
        numbers.add(5);
        numbers.add(3);

        System.out.println("The numbers are: "+numbers);

        Iterator<Integer> iterator= numbers.iterator();

        while (iterator.hasNext()){
            System.out.print(iterator.next());
            System.out.print(" ");
        }
    }
}
