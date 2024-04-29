package week6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;

public class helloreader {
    public static void main(String[] args) throws IOException {

        FileReader reader = new FileReader("Hello.txt");
        BufferedReader  bufferedReader = new BufferedReader(reader);
        String line = bufferedReader.readLine();

        while (line != null) {
            System.out.println(line);
            line = bufferedReader.readLine();
        }


// if there is no more to read it will return null
        // easier to write loop
        bufferedReader.close();
  }
}
