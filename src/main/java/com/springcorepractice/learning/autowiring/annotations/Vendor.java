package com.springcorepractice.learning.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Vendor {

    @Autowired  // Can be applied to setter and constructor as well
    @Qualifier("address2")
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
