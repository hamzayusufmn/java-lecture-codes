package week2;

public class oilchange {

    public static void main(String[] args) {
        int mileage = 150000;
        int interval = 3000;


        for (int oilChange = 0; oilChange < 8; oilChange++) {
            mileage = mileage + interval;
            System.out.println(" get an oil change at " + mileage + "miles");



        }

    }
}

