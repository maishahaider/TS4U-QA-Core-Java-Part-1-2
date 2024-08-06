package coreJavaPart4.enumExample.orderPizza;

public class PizzaSize {
    //instance of enum
    Size pizzaSize;

    //constructor to get the value of the pizza size
    public PizzaSize(Size pizzaSize){
        this.pizzaSize=pizzaSize;
    }

    //method to order the pizza

    public void orderPizza(){
        switch (pizzaSize){
            case SMALL:
                System.out.println("Order the small size pizza");
                break;
            case MEDIUM:
                System.out.println("Order the medium size pizza");
                break;
            case LARGE:
                System.out.println("Order the large size pizza");
                break;
            case EXTRALARGE:
                System.out.println("Order the extra large size pizza");
                break;
            default:
                System.out.println("This is size is not available");
                break;
        }
    }
}
