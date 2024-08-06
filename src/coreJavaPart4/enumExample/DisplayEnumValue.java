package coreJavaPart4.enumExample;

public class DisplayEnumValue {
    public static final String MY_TEXT= "Hello World!";
    public static void main(String[] args) {


        String result= MY_TEXT.concat("Hi");
        System.out.println(result);


        System.out.println(Size.SMALL);
        System.out.println(Size.MEDIUM);
        System.out.println(Size.EXTRALARGE);
    }
}
