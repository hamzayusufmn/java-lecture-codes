package week6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class hellowriting {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("Hello.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        bufferedWriter.write("Hello!\n");
        bufferedWriter.write("Hello Java Students\n");
        bufferedWriter.write("Goodbye!\n");
        bufferedWriter.newLine();
        // file will always be created and if not it will be overwritten remeber this


        bufferedWriter.close(); // ALWAYS include
        // add io expection to make sure everything goes smooth.

        // adding more
        FileWriter writer2 = new FileWriter("Hello.txt", true);
        // appending flag adds this code aswell
        BufferedWriter bufferedWriter2 = new BufferedWriter(writer2);

        bufferedWriter2.write("Other Data");
        bufferedWriter2.newLine();
        bufferedWriter2.write("Hello Programmers");
        bufferedWriter2.newLine();
        bufferedWriter2.write("End of file");
        bufferedWriter2.newLine();
        bufferedWriter2.close();



    }
    }
