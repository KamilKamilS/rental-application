package com.kamil.rentalapplication.infrastructure.persistence.jpa.hotel;

import com.kamil.rentalapplication.domain.hotel.Hotel;
import com.kamil.rentalapplication.domain.hotel.HotelRepository;

class JpaHotelRepository implements HotelRepository {
    private final SpringJpaHotelRepository springJpaHotelRepository;

    JpaHotelRepository(SpringJpaHotelRepository springJpaHotelRepository) {
        this.springJpaHotelRepository = springJpaHotelRepository;
    }

    @Override
    public void save(Hotel hotel) {
        springJpaHotelRepository.save(hotel);
    }
}
