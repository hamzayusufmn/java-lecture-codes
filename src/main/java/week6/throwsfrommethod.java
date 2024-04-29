package week6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class throwsfrommethod {
    public static void main(String[] args) {
        String filename = "not_exists";

        try {
            List<String> data = readfromFile(filename);
            System.out.println(data);
        } catch (IOException e) {
            System.out.println("Could not read from file " + filename);
        }
    }

    private static List<String> readfromFile(String filename) throws IOException {
        List<String> lines = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                lines.add(line);
                line = bufferedReader.readLine();
            }
        }
        return lines;
    }
}
