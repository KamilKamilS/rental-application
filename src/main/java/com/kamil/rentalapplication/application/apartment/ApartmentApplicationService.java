package com.kamil.rentalapplication.application.apartment;

import com.kamil.rentalapplication.domain.apartment.Address;
import com.kamil.rentalapplication.domain.apartment.Apartment;
import com.kamil.rentalapplication.domain.apartment.Room;
import com.kamil.rentalapplication.domain.apartment.SquareMeter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ApartmentApplicationService {

    public void add(String ownerId, String street, String postalCode, String houseNumber, String apartmentNumber,
                    String city, String country, String description, Map<String, Double> roomsDefinition) {

        Address adress = new Address(street, postalCode, houseNumber, apartmentNumber, city, country);
        List<Room> rooms = new ArrayList<>();
        roomsDefinition.forEach((name, size) -> {
            rooms.add(new Room(name, new SquareMeter(size)));
        });

        Apartment apartment = new Apartment(ownerId, adress, description);
    }
}
