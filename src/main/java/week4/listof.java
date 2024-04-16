package week4;

import java.util.List;

public class listof {
    public static void main(String[] args) {
        List<String > animals = List.of("cats", "bird", "lion" );
        System.out.println(animals);
        animals.remove("lion");
        // list of can be more handy if its the same size

    }
}
