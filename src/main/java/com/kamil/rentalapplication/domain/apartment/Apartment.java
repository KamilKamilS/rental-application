package com.kamil.rentalapplication.domain.apartment;

public class Apartment {
    private final String ownerId;
    private final Address adress;
    private final String description;

    public Apartment(String ownerId, Address adress, String description) {
        this.ownerId = ownerId;
        this.adress = adress;
        this.description = description;
    }
}
