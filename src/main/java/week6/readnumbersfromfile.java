package week6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class readnumbersfromfile {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        String filename = "Numberss.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line = reader.readLine();

            while (line != null) {
                try {
                    int number = Integer.parseInt(line);
                    numbers.add(number);
                } catch (NumberFormatException e) {
                    System.out.println(line + " is not an integer, ignoring");
                }
                line = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e);
        }


    }
}
