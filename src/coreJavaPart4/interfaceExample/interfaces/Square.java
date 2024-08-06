package coreJavaPart4.interfaceExample.interfaces;

public class Square implements Polygon{
    public void getArea(int length, int width){
        System.out.println("The area og the square is: "+(length*width));
    }
}
