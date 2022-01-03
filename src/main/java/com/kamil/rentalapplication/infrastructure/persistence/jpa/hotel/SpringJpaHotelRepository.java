package com.kamil.rentalapplication.infrastructure.persistence.jpa.hotel;

import com.kamil.rentalapplication.domain.hotel.Hotel;
import org.springframework.data.repository.CrudRepository;

interface SpringJpaHotelRepository extends CrudRepository<Hotel, String> {
}
