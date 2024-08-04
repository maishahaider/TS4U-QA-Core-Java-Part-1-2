package coreJavaPart3;

public class StringExample {
    public static void main(String[] args) {
        String text1="Hello ";
        String text2= text1;
        System.out.println("The first string is: "+text1);
        System.out.println("The second string is: "+text2);

        text1= text1+"World ";
        System.out.println(text1);
        System.out.println(text2);


//        Get length of a string
        String text="Java";
        System.out.println(text);
         int stringLenght= text.length();
        System.out.println(stringLenght);

        // Join two string

       String text3= " is a programming language ";
       String joinString= text.concat(text3);
        System.out.println(joinString);
 // Joining more than 2 string
        String concatAllValue= text1+text+text3;
        System.out.println(concatAllValue);
     //Remove spaces from text
        String result= concatAllValue.replaceFirst("\\s","");
        System.out.println(result);

        // Remove number from string
        String newText= "Hello123Cooper345";
        String regex="\\d";
        System.out.println("Before removing number: "+newText);
        System.out.println("After removing the number: "+newText.replaceAll(regex," "));
    }

}
