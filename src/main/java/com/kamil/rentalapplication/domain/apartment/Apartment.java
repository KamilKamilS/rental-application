package com.kamil.rentalapplication.domain.apartment;

import java.util.List;

public class Apartment {
    private String id;
    private final String ownerId;
    private final Address adress;
    private final String description;
    private final List<Room> rooms;

    Apartment(String ownerId, Address adress, String description, List<Room> rooms) {
        this.ownerId = ownerId;
        this.adress = adress;
        this.description = description;
        this.rooms = rooms;
    }
}
