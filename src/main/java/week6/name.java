package week6;

import java.io.*;

public class name {
    public static void main(String[] args) throws IOException {

        String filename = "data.txt";
        String name = "Hamza";
        String favoriteColor = "Yellow";
        int classcode = 2545;


        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename));
        bufferedWriter.write(name + "\n");
        bufferedWriter.write(favoriteColor+ "\n");
        bufferedWriter.newLine();
        bufferedWriter.write(classcode + "\n");





        bufferedWriter.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));


        String line = bufferedReader.readLine();


        while (line != null) {
            System.out.println(line);
             line = bufferedReader.readLine();

        }
        bufferedReader.close();

    }
}
