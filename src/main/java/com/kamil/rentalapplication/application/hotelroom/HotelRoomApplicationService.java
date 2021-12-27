package com.kamil.rentalapplication.application.hotelroom;

import com.kamil.rentalapplication.domain.hotelroom.HotelRoom;
import com.kamil.rentalapplication.domain.hotelroom.HotelRoomFactory;

import java.util.Map;

public class HotelRoomApplicationService {

    public void add(String hotelId, int number, String description, Map<String, Double> spaceDefinition) {

        HotelRoom hotelRoom = new HotelRoomFactory().create(hotelId, number, description, spaceDefinition);
    }
}
