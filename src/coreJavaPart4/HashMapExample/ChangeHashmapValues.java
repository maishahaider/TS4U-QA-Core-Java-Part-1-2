package coreJavaPart4.HashMapExample;

import java.util.HashMap;

public class ChangeHashmapValues {
    public static void main(String[] args) {
        //create a hashmap
        HashMap<String,String> colors=new HashMap<>();

        //insert the elements

        colors.put("IndianRed","#CD5C5C");
        colors.put("Salmon"," #FA8072");
        colors.put("LightSalmon","#FFA07A");
        colors.put("DarkSalmon","#E9967A");

        System.out.println("The codes of the colors are: "+colors);

        //replace element

        String replaceElement= colors.replace("Salmon","White");
        System.out.println(replaceElement);

        System.out.println(colors);
    }

}
