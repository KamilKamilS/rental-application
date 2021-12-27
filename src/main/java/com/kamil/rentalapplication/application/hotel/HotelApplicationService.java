package com.kamil.rentalapplication.application.hotel;

import com.kamil.rentalapplication.domain.hotel.Hotel;
import com.kamil.rentalapplication.domain.hotel.HotelFactory;

public class HotelApplicationService {

    public void add(String name, String street, String buildingName, String postalCode, String city, String country) {
        Hotel hotel = new HotelFactory().create(name, street, buildingName, postalCode, city, country);
    }

}
