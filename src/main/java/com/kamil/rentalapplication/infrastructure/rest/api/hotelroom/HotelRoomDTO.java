package com.kamil.rentalapplication.infrastructure.rest.api.hotelroom;

import java.util.Map;

public class HotelRoomDTO {

    private final String hotelId;
    private final int number;
    private final String description;
    private final Map<String, Double> spaceDefinition;

    public HotelRoomDTO(String hotelId, int number, String description, Map<String, Double> spaceDefinition) {
        this.hotelId = hotelId;
        this.number = number;
        this.description = description;
        this.spaceDefinition = spaceDefinition;
    }

    public String getHotelId() {
        return hotelId;
    }

    public int getNumber() {
        return number;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Double> getSpaceDefinition() {
        return spaceDefinition;
    }
}
