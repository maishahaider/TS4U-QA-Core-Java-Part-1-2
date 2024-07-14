package coreJavaPart2;

public class ArrayExample {
    public static void main(String[] args) {
        String [] name={"John","Ben","Smith"};
        System.out.println("The first name is: "+ name[0]);
        System.out.println("The second name is: "+ name[1]);
        System.out.println("The third name is: "+ name[2]);

        //display all the values using for each loop

        for (String displayValues:name){
            System.out.println(displayValues);
        }
    }
}
