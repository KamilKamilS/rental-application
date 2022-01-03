package com.kamil.rentalapplication.infrastructure.persistence.jpa.hotel;

import com.kamil.rentalapplication.domain.hotel.Hotel;
import org.springframework.data.repository.CrudRepository;

public interface SpringJpaHotelRepository extends CrudRepository<Hotel, Long> {
}
