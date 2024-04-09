package week2;

import java.util.Arrays;

public class arrayexamples {
    public static void main(String[] args) {
        // exa,ples int arrays
        int[] numbers = new int[5];
        numbers[0] = 4;
        numbers[1] = 100;
//        numbers[5] = 3;


            String[] classNames = { "Java", "c#", "web"};
//            classnames[0] = "Java";
//            classnames[1] = "c#";
//            classnames[2] = "web";

        System.out.println("one of the second year classes is " + classNames[2]);

        int numberofClasses = classNames.length;
        System.out.println("there are"+ numberofClasses + "classes");

        for(int x = 0; x<classNames.length;x++) {

            System.out.println("a class name is" + classNames[x]);


        }
        System.out.println(Arrays.toString(classNames));




    }
}
