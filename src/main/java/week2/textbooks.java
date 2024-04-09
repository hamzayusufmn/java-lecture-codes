package week2;
import java.util.Arrays;

import static input.InputUtils.stringInput;

public class textbooks {
    public static void main(String[] args) {
        // create an array to store 5 strings
        String[] textbooks = new String[5];


        // looop repeat 5 times. notice the loop counter variable 'number'
        // counts frm 0,1,2,3,4
        // can use a loop to read from

        for (int number = 0; number < textbooks.length; number++) {
            String bookname = stringInput(" Please enter name of textbook");
            // using loop counter to write each array element in turn.
            textbooks[number] = bookname;

        }
        System.out.println(" Thank you: here is the data you entered");
        // this will help bring it all together
        System.out.println(Arrays.toString(textbooks));

    }




}
