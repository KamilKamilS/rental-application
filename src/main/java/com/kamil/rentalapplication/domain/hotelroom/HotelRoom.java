package com.kamil.rentalapplication.domain.hotelroom;

import java.util.List;

public class HotelRoom {
    private final String hotelId;
    private final int number;
    private final String description;
    private final List<Space> spaces;

    HotelRoom(String hotelId, int number, String description, List<Space> spaces) {
        this.hotelId = hotelId;
        this.number = number;
        this.description = description;
        this.spaces = spaces;
    }
}
