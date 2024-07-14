package coreJavaPart2;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int [][] number={{10,20,30},{40,50,60},{70,80,90}};
        System.out.println("The number is: "+ number[1][2]);
        System.out.println("The number is: "+ number[2][0]);
        System.out.println("The number is: "+ number[2][1]);
        System.out.println("The number is: "+ number[1][0]);

        //display all the values of multi dmensional array

        for (int i=0;i<3; i++)
            for (int j=0;j<3;j++){
                System.out.println("The values of multi dimensional array is: "+ number[i][j]);
            }
    }
}
