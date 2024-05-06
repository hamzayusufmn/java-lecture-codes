package weeek8;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HelloGUImobileProgram {
    public static void main(String[] args) {
        String filename = "numbers.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            String line = bufferedReader.readLine();


            while (line !=null ) {
                System.out.println(line);
                line = bufferedReader.readLine();

            }

        } catch (IOException e) {
            System.out.println("Sorry , error or file not found" + e);
        }


    }


}
