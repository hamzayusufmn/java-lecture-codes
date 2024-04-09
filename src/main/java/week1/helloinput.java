package week1;


import static input.InputUtils.intInput;
import static  input.InputUtils.stringInput;


public class helloinput {


    public static void main(String[] args) {
        String Name = stringInput("please enter your number" );
        System.out.println("hello" + Name + "!");

        int numberofClasses = intInput(" how many classes are you taking this semester");
        System.out.println(" You are taking" + numberofClasses + "classes this semester.");


        String units = "classes";

        if (numberofClasses == 1) {
            units = "class";

        }

        System.out.println("you are taking " + numberofClasses + " " + units + "this semester");
        System.out.printf(" you are taking %d this semester", numberofClasses, units);






    }

}