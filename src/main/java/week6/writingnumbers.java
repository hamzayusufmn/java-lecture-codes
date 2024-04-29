package week6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class writingnumbers {
    public static void main(String[] args) throws IOException {

        int data1 = 67;
        int data2 = 65;
        int data3 = 84;

        double number = 12.34;

        FileWriter writer = new FileWriter("Numbers.txt");

        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        bufferedWriter.write(data1 + "\n");
        bufferedWriter.write(data2 + "\n");
        bufferedWriter.write(data3 + "\n");

        bufferedWriter.write(number + "\n");

        bufferedWriter.write(number + "\n");
        // code will produce cat unless you add and write a string
        // adding intergr to string will make all numbers appear in one line


        bufferedWriter.write(number + "\n");
        bufferedWriter.write("Test");
        bufferedWriter.close();



    }
}
