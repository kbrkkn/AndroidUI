package ui.android.coffeeorder;

/**
 * Created by Kubra on 10.11.2016.
 */

public class Order {
    private int price;
    private int numberOfCups;

    public void setPrice(int price) {
        this.price = price;
    }

    public void setNumberOfCups(int numberOfCups) {
        this.numberOfCups = numberOfCups;
    }

    public int getNumberOfCups() {
        return numberOfCups;
    }

    public int getPrice() {
        return price;
    }



}
