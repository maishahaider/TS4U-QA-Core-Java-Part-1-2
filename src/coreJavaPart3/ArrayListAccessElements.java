package coreJavaPart3;

import java.util.ArrayList;

public class ArrayListAccessElements {
    public static void main(String[] args) {
        ArrayList<String> programmingLanguage= new ArrayList<>();
        programmingLanguage.add("C");
        programmingLanguage.add("Java");
        programmingLanguage.add("Python");
        programmingLanguage.add("C#");
        System.out.println("The programming languages are: "+programmingLanguage);

//Access Element
        String accessValue= programmingLanguage.get(2);
        System.out.println("Accessible element is: "+accessValue);

        //Update value

        programmingLanguage.set(0, "C++");
        System.out.println("Updated value is"+programmingLanguage);

        // remove a value
        programmingLanguage.remove(3);
        System.out.println("After removing: "+programmingLanguage);
    }
}
