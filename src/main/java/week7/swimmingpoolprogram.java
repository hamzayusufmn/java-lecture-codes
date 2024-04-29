package week7;

public class swimmingpoolprogram {
    public static void main(String[] args) {
        swimmingpool ymca = new swimmingpool("Ymca", 50);
        // add the constructor

        double totalSwam = ymca.DistanceforLaps(6);
        System.out.println(ymca);

        System.out.println("the total distance is" + totalSwam + "Meters");

        swimmingpool como = new swimmingpool("Como park ", 35);
        System.out.println(como.DistanceforLaps(10));
        System.out.println(como);

        // create however much

        swimmingpool edina = new swimmingpool("edina", 50);
        double distance = edina.DistanceforLaps(12);
        System.out.println(distance);
        System.out.println(edina);

    }
}