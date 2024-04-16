package week4;

import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.positiveDoubleInput;

public class speeds {
    public static void main(String[] args) {
        List<Double> speeds = new ArrayList<>();

        int totalhours = 12;
        for ( int hour = 0; hour < totalhours; hour++) {
            double speed = positiveDoubleInput("enter the internet speed for hour" + hour);
            // taking out { unlocked my code to finally work
            speeds.add(speed);
        }

            System.out.println("all the speeds are");

            for (int hour = 0; hour < speeds.size(); hour++)  {
                double speed = speeds.get(hour);
                System.out.printf("hour: %d speed %.2f\n", hour, speed);


                // its already defined in scope how to fix it
                // i closed the bracket and it worked!!!
            }
            int zeroCount = 0;
            for(double speed: speeds) {
                if (speed == 0) {
                    zeroCount++;
                    System.out.println("Number of times speed was 0 (no connection) : " + zeroCount);
                    // make sure to remoce all 0
                }


                }
                while (speeds.contains(0.0)) {
                    speeds.remove(0.0);
                    System.out.println(speeds);
                }
                    // this will give us more accuarte testing if we go  by 0.0 rather than 0

                    double total = 0;
                    for (double speed: speeds) {
                        total = total + speed;

                        double average = total + speeds.size();
                        System.out.println("the average speed is "+ average);
// this solves the average speed
                    }


                }
            }







