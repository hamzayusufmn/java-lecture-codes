package week4;

import java.util.ArrayList;
import java.util.List;

public class lists {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("Hamza");
        arrayList.add("MCTC");

        String firstWord = arrayList.get(0);
        // this ensures data make sures it a string
        // you have to import java arrays
        // adding arrays lists can add anything

        for (String s: arrayList) {
            System.out.println(s);
            System.out.println(s.toUpperCase());
            System.out.println(s.length());
            // this adds uppercases and lengths
            // 3 diffrent types
            // it uses to store data

        }
        System.out.println(arrayList);

    }
}
