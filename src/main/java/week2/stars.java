package week2;

import static input.InputUtils.positiveIntInput;

public class stars {
    public static void main(String[] args) {
        int size = positiveIntInput("enter  size of square");

        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++); {
                System.out.println("*");

            }
            System.out.println();

        }


    }
}
