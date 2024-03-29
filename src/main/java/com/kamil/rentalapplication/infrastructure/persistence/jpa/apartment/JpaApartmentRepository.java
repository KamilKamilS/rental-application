package com.kamil.rentalapplication.infrastructure.persistence.jpa.apartment;

import com.kamil.rentalapplication.domain.apartment.Apartment;
import com.kamil.rentalapplication.domain.apartment.ApartmentRepository;

class JpaApartmentRepository implements ApartmentRepository {
    private final SpringJpaApartmentRepository springJpaApartmentRepository;

    JpaApartmentRepository(SpringJpaApartmentRepository springJpaApartmentRepository) {
        this.springJpaApartmentRepository = springJpaApartmentRepository;
    }

    @Override
    public void save(Apartment apartment) {
        springJpaApartmentRepository.save(apartment);
    }

    @Override
    public Apartment findById(String id) {
        return springJpaApartmentRepository.findById(id).get();
    }
}
