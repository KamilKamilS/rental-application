package com.kamil.rentalapplication.infrastructure.persistence.jpa.apartment;

import com.kamil.rentalapplication.domain.apartment.Apartment;
import org.springframework.data.repository.CrudRepository;

interface SpringJpaApartmentRepository extends CrudRepository<Apartment, String> {
}
