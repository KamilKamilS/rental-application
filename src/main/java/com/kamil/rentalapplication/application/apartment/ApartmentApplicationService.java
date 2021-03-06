package com.kamil.rentalapplication.application.apartment;

import com.kamil.rentalapplication.domain.apartment.Apartment;
import com.kamil.rentalapplication.domain.apartment.ApartmentFactory;
import com.kamil.rentalapplication.domain.apartment.ApartmentRepository;

import java.time.LocalDate;
import java.util.Map;

public class ApartmentApplicationService {
    private final ApartmentRepository apartmentRepository;

    public ApartmentApplicationService(ApartmentRepository apartmentRepository) {
        this.apartmentRepository = apartmentRepository;
    }

    public void add(String ownerId, String street, String postalCode, String houseNumber, String apartmentNumber,
                    String city, String country, String description, Map<String, Double> roomsDefinition) {

        Apartment apartment = new ApartmentFactory().create(ownerId, street, postalCode, houseNumber, apartmentNumber, city, country, description, roomsDefinition);

        apartmentRepository.save(apartment);
    }

    public void book(String id, String tenantId, LocalDate start, LocalDate end) {

    }
}
