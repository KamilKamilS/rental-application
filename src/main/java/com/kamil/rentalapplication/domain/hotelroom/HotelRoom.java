package com.kamil.rentalapplication.domain.hotelroom;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class HotelRoom {
    @Id
    @GeneratedValue
    private String id;
    private final String hotelId;
    private final int number;
    private final String description;
    @OneToMany
    private final List<Space> spaces;

    HotelRoom(String hotelId, int number, String description, List<Space> spaces) {
        this.hotelId = hotelId;
        this.number = number;
        this.description = description;
        this.spaces = spaces;
    }
}
