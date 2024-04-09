package week1;

import static input.InputUtils.stringInput;

public class comparestrings {


    public static void main(String[] args) {
        String college = stringInput(" which college do you attend");

        if (college.equals("MCTC") ) {
        System.out.println(" Yay, MCTC");
    }  else
         System.out.println(" too bad, you should check out MCTC");


    }


}