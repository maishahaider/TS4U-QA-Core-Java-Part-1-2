package coreJavaPart1;

public class StringCount {
    public static void main(String[] args) {

        String myText=("Hello this is Core Java Part-1 hands-on practice");
        count(myText);
    }
    public static void count(String text){
        char[] ch1= text.toCharArray();
        int letter=0;
        int space= 0;
        int number=0;
        int otherChar=0;
            for(int i=0; i<text.length(); i++){
                if(Character.isLetter(ch1[i])){
                    letter++;
                } else if (Character.isDigit(ch1[i])) {
                    number++;
                    
                } else if (Character.isSpaceChar(ch1[i])) {
                    space++;
                }else {
                    otherChar++;
                }
            }
        System.out.println("Letter: "+letter);
        System.out.println("Number: "+number);
        System.out.println("Spaces: "+space);
        System.out.println("Other Characters: "+otherChar);

}
}








