package com.kamil.rentalapplication.application.hotelroom;

import com.kamil.rentalapplication.domain.hotelroom.HotelRoom;
import com.kamil.rentalapplication.domain.hotelroom.HotelRoomFactory;
import com.kamil.rentalapplication.domain.hotelroom.HotelRoomRepository;

import java.util.Map;

public class HotelRoomApplicationService {
    private final HotelRoomRepository hotelRoomRepository;

    public HotelRoomApplicationService(HotelRoomRepository hotelRoomRepository) {
        this.hotelRoomRepository = hotelRoomRepository;
    }

    public void add(String hotelId, int number, String description, Map<String, Double> spaceDefinition) {

        HotelRoom hotelRoom = new HotelRoomFactory().create(hotelId, number, description, spaceDefinition);

        hotelRoomRepository.save(hotelRoom);
    }
}
