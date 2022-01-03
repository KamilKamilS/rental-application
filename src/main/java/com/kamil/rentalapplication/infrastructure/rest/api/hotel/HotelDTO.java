package com.kamil.rentalapplication.infrastructure.rest.api.hotel;

public class HotelDTO {
    private final String name;
    private final String street;
    private final String buildingName;
    private final String postalCode;
    private final String city;
    private final String countr;

    public HotelDTO(String name, String street, String buildingName, String postalCode, String city, String countr) {
        this.name = name;
        this.street = street;
        this.buildingName = buildingName;
        this.postalCode = postalCode;
        this.city = city;
        this.countr = countr;
    }

    public String getName() {
        return name;
    }

    public String getStreet() {
        return street;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    public String getCountr() {
        return countr;
    }
}
