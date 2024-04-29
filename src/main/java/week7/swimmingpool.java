package week7;

public class swimmingpool {

    private String name; // variable
    private double length;

   public swimmingpool(String poolname, double poollength) {
       name = poolname;
       length = poollength;

    }
// instance method
    // a pool object would be a pool class instance
    public double DistanceforLaps(int laps) {
        // this will tell lengh of 50 and 10 laps will be meters

        double total = laps * this.length;
    return total;

    }
    @Override
    public  String toString() {
        String descripton = this.name + "pool is" + length + "Meters long";
        return descripton;
        // this will tell us which pool and length rather than object and adress
    }
}

