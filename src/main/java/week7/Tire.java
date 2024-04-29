package week7;

public class Tire implements Comparable<Tire> {
    private String name;
    private double price;
    private int warrantyMiles;
    // private and public can detrmine if you can and cannot use

    public Tire(String name, double price, int warrantyMiles) {
        this.name = name;
        this.price = price;
        this.warrantyMiles = warrantyMiles;
    }

    public double pricePer1000Miles() {
        return (this.price / this.warrantyMiles) * 1000;
    }

    public double costForSet() {
        return this.price * 4;
    }

    @Override
    public String toString() {
        return String.format("%s costs $%.2f per tire. Cost per 1000 miles is $%.2f.", this.name, this.price, this.pricePer1000Miles());
    }

    @Override
    public int compareTo(Tire anotherTire) {
        return Double.compare(this.pricePer1000Miles(), anotherTire.pricePer1000Miles());
    }
}