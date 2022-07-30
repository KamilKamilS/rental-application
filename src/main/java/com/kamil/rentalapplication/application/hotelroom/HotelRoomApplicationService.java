package com.kamil.rentalapplication.application.hotelroom;

import com.kamil.rentalapplication.domain.eventchannel.EventChannel;
import com.kamil.rentalapplication.domain.hotelroom.HotelRoom;
import com.kamil.rentalapplication.domain.hotelroom.HotelRoomFactory;
import com.kamil.rentalapplication.domain.hotelroom.HotelRoomRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class HotelRoomApplicationService {
    private final HotelRoomRepository hotelRoomRepository;
    private final EventChannel eventChannel;

    public HotelRoomApplicationService(HotelRoomRepository hotelRoomRepository, EventChannel eventChannel) {
        this.hotelRoomRepository = hotelRoomRepository;
        this.eventChannel = eventChannel;
    }

    public void add(String hotelId, int number, String description, Map<String, Double> spaceDefinition) {

        HotelRoom hotelRoom = new HotelRoomFactory().create(hotelId, number, description, spaceDefinition);

        hotelRoomRepository.save(hotelRoom);
    }

    public void book(String id, String tenantId, List<LocalDate> days) {
        HotelRoom hotelRoom = hotelRoomRepository.findById(id);
        hotelRoom.book(tenantId, days, eventChannel);
    }
}
