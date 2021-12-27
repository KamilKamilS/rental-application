package com.kamil.rentalapplication.domain.hotel;

public class HotelFactory {

    public Hotel create(String name, String street, String buildingName, String postalCode, String city, String country) {
        Address address = new Address(street, buildingName, postalCode, city, country);
        return new Hotel(name, address);
    }
}
