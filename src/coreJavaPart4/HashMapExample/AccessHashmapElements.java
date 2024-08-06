package coreJavaPart4.HashMapExample;

import java.util.HashMap;

public class AccessHashmapElements {

    public static void main(String[] args) {
        HashMap<Integer,String> cars=new HashMap<>();

        //adding the elements
        cars.put(1,"BMW");
        cars.put(2,"Audi");
        cars.put(3,"Ferrari");
        cars.put(4,"Toyota");

        System.out.println("Print the values: "+cars);

        //access a specific element
        System.out.println(cars.get(4));
    }
}
