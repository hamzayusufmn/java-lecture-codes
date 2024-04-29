package week6;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ArrayExpections {
    public static void main(String[] args) {
         String[] classnames = {"Web", "Java", "C#"};
         for (String name : classnames) {

             System.out.println(name);


             List<Integer> classcodes = new LinkedList<>();
             classcodes.add(2560);
             classcodes.add(2545);
             classcodes.add(2505);
             for (int i = 0; i < classcodes.size(); i++) {
                 System.out.println(classcodes.get(i));


             }
             Random rnd = makeRandomNumberGenerator();
             System.out.println(getRandomNumber(rnd));
         }
    }

    public static Random makeRandomNumberGenerator() {
        return new Random();
    }


    public static int getRandomNumber(Random rnd) { // this one is null
        return rnd.nextInt(); // rnd is null






         }
    }
