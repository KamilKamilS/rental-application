package com.kamil.rentalapplication.domain.hotelroom;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HotelRoomFactory {

    public HotelRoom create(String hotelId, int number, String description, Map<String, Double> spaceDefinition) {
        List<Space> spaces = spaceDefinition.entrySet().stream()
                .map(entry -> {
                    SquareMeter squareMeter = new SquareMeter(entry.getValue());
                    return new Space(entry.getKey(), squareMeter);
                })
                .collect(Collectors.toList());

        return new HotelRoom(hotelId, number, description, spaces);
    }
}
