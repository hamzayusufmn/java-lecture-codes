package week1;

import static input.InputUtils.yesNoInput;

public class canyoutakeandorid {


    public static void main(String[] args) {
        System.out.println("This program will check if you meet the pre-requisites for taking ITEC 2417 Android Programming");
        System.out.println("Please answer these two following questions ");

        boolean hasTakenCsharp = yesNoInput("Have you taken ITEC 2585 C# Programming");
        boolean hasTakenJava = yesNoInput(" Have you ever taken ITEC 2545 Java Programming");


        // use an or operator in the condition to check if requirments are met

        if (hasTakenCsharp || hasTakenJava) {
            System.out.println(" You meet the requirements. You may take itec 2417 Android Programming ");
        } else {
            System.out.println(" You do not meet the requirements. you need to complete C# or Java");
        }
    }










}