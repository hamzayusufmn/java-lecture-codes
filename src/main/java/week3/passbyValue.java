package week3;

public class passbyValue {
    public static void main(String[] args) {
        int miles = 6;
       miles = changetoKM(miles);
       // can be dobled
        System.out.println(miles); // the answer still 6
        String units = "Miles";

       units = changeToMetricUnits(units);
        System.out.println(units); // this will still be considerd miles
        double[] speeds = {4,5,10,12};
        convertToKilometers(speeds);
        // this is miles per hour




        // you can create methods by pass values to make code work
        // two diffrents of sending data pass by and passing object refrence



    }

    private static void convertToKilometers(double[] speeds) {
        /// when coding here i would put ; and this caused my double speed [] to crash
        for (int c = 0; c < speeds.length ; c++) {
            double speed = speeds[c];
            double speedKm = speed * 1.6;
            speeds[c] = speedKm;

        }
    }

    private static int changetoKM(int distance) {
        distance = 10;
        return distance;
        // make static int

    }

    private static String changeToMetricUnits(String units) {
        // dont change to int but string

        units = "Kilometers";
        return units;

    }

}


