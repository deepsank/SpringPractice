package com.springcorepractice.learning.autowiring;

public class Vendor {

    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Vendor() {
    }

    public Vendor(Address address) {
        super();
        this.address = address;
        System.out.println("Inside constructor");
    }

    @Override
    public String toString() {
        return "Vendor{" +
                "address=" + address +
                '}';
    }
}
