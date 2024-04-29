package week6;

public class stringtest {
    public static void main(String[] args) {


            String hopethisanumber = "42";
            try {
            int number = Integer.parseInt(hopethisanumber);

            System.out.println("This number is " + number);
        } catch (NumberFormatException e) {
            System.out.println(hopethisanumber + "This is not a valid integer");

        }
        System.out.println("This is the end of the program");
// this will try and then catch if code isnt wrong then the catch will prevent it.
    }
}