package week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class addinglists {
    public static void main(String[] args) {
        List<Integer> classCodes  = new ArrayList<>();
        classCodes.add(2545);
        classCodes.add(1150);
        classCodes.add(1250);
        classCodes.add(0, 1425);
        // index and element
        Collections.shuffle(classCodes);
        String alphabeticalFirst = String.valueOf(Collections.min(classCodes));
        System.out.println(alphabeticalFirst);
        // this sorts out by name and shuffle

        System.out.println(classCodes);
        System.out.println(classCodes.size());

        for (int classCode : classCodes );
        System.out.println("ITEC " + classCodes);
        // this can be confused with classCodes so be careful hamza.




    }
}
