package week3;

import static input.InputUtils.intInput;

public class credits {
    public static void main(String[] args) {
        int  required = intInput("how many credits does your program require");
        int earned = intInput(" how many credits have you earned");
        int needed = howManyCreditsToGradute(required, earned);
        System.out.println("you need" + needed + "credits");
        // this method can used by the system F which can be used by % also



    }
    public static int howManyCreditsToGradute(int creditsneeded , int creditearned) {
        int creditstoGradute = creditsneeded - creditearned;
        return creditstoGradute;

    }
}
