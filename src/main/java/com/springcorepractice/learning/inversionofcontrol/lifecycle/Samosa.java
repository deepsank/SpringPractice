package com.springcorepractice.learning.inversionofcontrol.lifecycle;

public class Samosa {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Setting price to " + price);
        this.price = price;
    }

    public Samosa() {
    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }

    public void hello(){        // Init method --- can have any name
        System.out.println("Inside hello method");
    }
    public void byebye(){          // Destroy method --- can have any name
        System.out.println("Inside byebye method");
    }
}
