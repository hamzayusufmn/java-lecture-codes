package week1;

import static input.InputUtils.yesNoInput;

public class welding {


    public static void main(String[] args) {
    boolean cottonClothes = yesNoInput("are you wearing cotton clothes?");
    boolean woolClothes = yesNoInput(" Are you wearing wool clothes?");
    boolean closedtoeShoes = yesNoInput(" are you wearing closed toe shoes?");
    // boolean and either wool or cotton clothes can work but closed toe shoes are a must


    if(cottonClothes || woolClothes && closedtoeShoes) {
        System.out.println(" you are dressed safely");
    } else {
        System.out.println("You must wear cotton or wool clothes and closed toe shoes");

    }



    }












}