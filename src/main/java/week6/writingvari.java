package week6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class writingvari {
    public static void main(String[] args) throws IOException {

        int Classcode = 2454;
        double averageEnrollment = 22.16;
        // how much each semester
        String classname = "Java";

        FileWriter writer = new FileWriter("Java.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);


        bufferedWriter.write("The class code is" + Classcode + "\n");
        bufferedWriter.write( "The class name is" + classname + "\n");
        bufferedWriter.write("The average enrollment is" + averageEnrollment + "\n");

        bufferedWriter.close();
        // this or writer.close both work i prefer this


    }
}
