package week1;

import static input.InputUtils.*;

public class prices {



    public static void main(String[] args) {

        String productname = stringInput("what is the name of the product");
        double price = positiveDoubleInput(" what does " + productname + "cost?");
        int quantity = positiveIntInput("how many" + productname + "to sell");


        double totalPrice = price * quantity;

        System.out.println( quantity + "of" + productname + "at $" +
                price + "each cost $" + totalPrice);

        System.out.printf("%d of %s at $%.2f each costs $%.2f",
                quantity,productname, price ,totalPrice);



    }
}
