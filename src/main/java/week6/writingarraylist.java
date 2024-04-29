package week6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class writingarraylist {
    public static void main(String[] args) throws IOException {
        final String filename = "ITEC_Classes.txt";
        List<String>    classnames = List.of("Java", "WEB", "C#");


        List<Integer> classcodes = List.of(2545, 2560, 2505);

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename));
        for (int i = 0; i < classnames.size(); i++) {
            String name = classnames.get(i);
            int code = classcodes.get(i);
            bufferedWriter.write("ITEC" + code + " " + name + "\n");
        }
            bufferedWriter.close();
            // using for loops and will better the format
            // final string name helps with it not changing

            BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));

            List<String> classdescripton = new ArrayList<>();
            String line = bufferedReader.readLine();

            while(line != null) {
                classdescripton.add(line);
                line = bufferedReader.readLine();
                System.out.println("end of file reached");
                System.out.println(classdescripton);

            }
            // had error and moved the  close buffered away from the loop


        }


    }

