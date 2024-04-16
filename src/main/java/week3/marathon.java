package week3;

public class marathon {


    public static void main(String[] args) {

        double currentDistance = 1;
        double targetDistance = 26.2;
        double percentIncrease = 1.10; // this will be increased by 10 percent


        int week = 1;
  // loop untill we reach the current distance being larger than the target distance
        while (currentDistance < targetDistance) {
            System.out.println(week + " " + currentDistance);
            currentDistance = currentDistance * percentIncrease;
            week++;
            // keep copy of this and there are multiple ways to solve it
            // adding on to this code

        }


        System.out.println(week + " " + currentDistance);

    }
}