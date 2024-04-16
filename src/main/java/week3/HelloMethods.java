package week3;
import static input.InputUtils.stringInput;

public class HelloMethods {
    public static void main(String[] args) {
        String name = stringInput ("Please enter your name :");
        String greeting = makeGreeting(name);
        System.out.println(greeting);
        // return and arguments are a must

    }

    public static String makeGreeting(String n) {
        String greeting = " Hello " + n + "!";

        return greeting; // if u dont add return the code here wont work
        // code needs to be written in main string to output message
    }
}



