package week6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class codestylechecker {
    public static void main(String[] args) {
            String filename = "Numbers.txt";
            int macLineLength = 100;
            try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
                String line = reader.readLine();
                while (line != null) {
                    System.out.println(line);
                    line = reader.readLine();
                }
            } catch (IOException e) {
                System.out.println("Error reading file " + filename + " because " + e);
            }
        }
    }

