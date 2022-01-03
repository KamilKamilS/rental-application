package com.kamil.rentalapplication.application.hotel;

import com.kamil.rentalapplication.domain.hotel.Hotel;
import com.kamil.rentalapplication.domain.hotel.HotelFactory;
import com.kamil.rentalapplication.domain.hotel.HotelRepository;

public class HotelApplicationService {
    private final HotelRepository hotelRepository;

    public HotelApplicationService(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    public void add(String name, String street, String buildingName, String postalCode, String city, String country) {
        Hotel hotel = new HotelFactory().create(name, street, buildingName, postalCode, city, country);

        hotelRepository.save(hotel);
    }

}
