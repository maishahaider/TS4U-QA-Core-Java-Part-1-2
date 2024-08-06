package coreJavaPart4.interfaceExample.interfaces;

public class Rectangle implements Polygon,Circle{
    public void getArea(int length, int width){
        System.out.println("The area of the rectangle is: "+(length*width));

    }
    public void circleValue(){
        System.out.println("Circle value is 0");
    }
}
