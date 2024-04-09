package week1;

import static input.InputUtils.intInput;

public class numberquiz {


    public static void main(String[] args) {
        int secertnumber = 6;
        int guess = intInput(" guess this number i am thinking of");

        if (guess == secertnumber) {
            System.out.println("You guessed correctly!");
        }  else{
                System.out.println(" Sorry i was thinking of " + secertnumber);
            }
            }
        }

// this code can be upgraded with other one shown by teacher. the number can go up to 100.


