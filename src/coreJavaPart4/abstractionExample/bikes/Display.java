package coreJavaPart4.abstractionExample.bikes;

public class Display {
    public static void main(String[] args) {
        MountainBikes mountainBikes=new MountainBikes();
        mountainBikes.brake();
        SportsBike sportsBike= new SportsBike();
        sportsBike.brake();
        }
    }

