package com.kamil.rentalapplication.domain.hotel;

class Address {

    private final String street;
    private final String buildingName;
    private final String postalCode;
    private final String city;
    private final String country;

    Address(String street, String buildingName, String postalCode, String city, String country) {

        this.street = street;
        this.buildingName = buildingName;
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;
    }
}
