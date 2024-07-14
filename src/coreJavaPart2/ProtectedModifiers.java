package coreJavaPart2;



public class ProtectedModifiers  {
    protected String text1="Hello";

    protected void display(){
        System.out.println(text1);
    }

    public static void main(String[] args) {
        ProtectedModifiers protectedModifiers= new ProtectedModifiers();
        protectedModifiers.display();

        GetterSetterExample getterSetterExample= new GetterSetterExample();
        getterSetterExample.setName("Mim");
        System.out.println(getterSetterExample.getName());
    }

}
