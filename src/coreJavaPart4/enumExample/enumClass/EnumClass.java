package coreJavaPart4.enumExample.enumClass;

public enum EnumClass {
    //constants
    SMALL, MEDIUM, LARGE, EXTRALARGE;

    public String getSize(){
        switch (this){
            case SMALL:
                return "small";
            case MEDIUM:
                return "medium";
            case LARGE:
                return "large";
            case EXTRALARGE:
                return "extra large";
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        System.out.println("The size is: "+EnumClass.EXTRALARGE.getSize());
    }

}
