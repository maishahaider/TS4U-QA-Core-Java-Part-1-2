package coreJavaPart4.HashMapExample;

import java.util.HashMap;

public class ProgrammingLanguageAddByHashmap {
    public static void main(String[] args) {
        // create a hashmap
        HashMap<String,Integer> programmingLanguages= new HashMap<>();
        //add elements to this hashmap
         programmingLanguages.put("Java",20);
         programmingLanguages.put("JavaScript", 14);
         programmingLanguages.put("Python", 15);
         programmingLanguages.put("C++", 5);

        System.out.println("The keys and values of the hashmap is: "+ programmingLanguages);

    }
}
