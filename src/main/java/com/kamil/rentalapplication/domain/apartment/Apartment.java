package com.kamil.rentalapplication.domain.apartment;

import javax.persistence.*;
import java.util.List;

@Entity
public class Apartment {
    @Id
    @GeneratedValue
    private String id;

    private final String ownerId;

    @Embedded
    private final Address adress;
    private final String description;
    @OneToMany
    private final List<Room> rooms;

    Apartment(String ownerId, Address adress, String description, List<Room> rooms) {
        this.ownerId = ownerId;
        this.adress = adress;
        this.description = description;
        this.rooms = rooms;
    }
}
