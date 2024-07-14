package coreJavaPart2;

public class PrivateModifiers {

    private String text="Hello";

    private void display(){
        System.out.println(text);
    }

    public static void main(String[] args) {
        PrivateModifiers privateModifiers=new PrivateModifiers();
        privateModifiers.display();
        DefaultModifiers defaultModifiers= new DefaultModifiers();
        String t1= defaultModifiers.text11;
        System.out.println(t1);
    }
}
