package com.kamil.rentalapplication.infrastructure.persistence.jpa.hotel;

import com.kamil.rentalapplication.domain.hotel.Hotel;
import com.kamil.rentalapplication.domain.hotel.HotelRepository;

class JpaHotelRepository implements HotelRepository {
    private final SpringJpaHotelRepository hotelRepository;

    JpaHotelRepository(SpringJpaHotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public void save(Hotel hotel) {
        hotelRepository.save(hotel);
    }
}
