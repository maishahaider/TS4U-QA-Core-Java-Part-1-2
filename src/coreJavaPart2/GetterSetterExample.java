package coreJavaPart2;

public class GetterSetterExample {
    private String name;

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }

    public static void main(String[] args) {
        GetterSetterExample getterSetterExample= new GetterSetterExample();
        getterSetterExample.setName("Hello");
        System.out.println(getterSetterExample.getName());
    }
}
