package week0;

public class prices {


    public static void main(String[] args) {
        String productName = "packet of spaghetti";
        double price = 1.60;
        int quantity = 4;
         double totalPrice = price * quantity;

         System.out.println(quantity + "of " + productName
         + "at $ " + price + "each costs a total of $" + totalPrice );

         System.out.printf("%d of %s at $%.2f each costs a total of $.2f",
                 quantity, productName, price, totalPrice);
         // this helps with string formatting verison for 2 decimal places in the prices




    }
}