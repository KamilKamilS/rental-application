package com.kamil.rentalapplication.infrastructure.persistence.jpa.hotelroom;

import com.kamil.rentalapplication.domain.hotelroom.HotelRoomRepository;
import com.kamil.rentalapplication.domain.hotelroom.HotelRoom;

class JpaHotelRoomRepository implements HotelRoomRepository {
    private final SpringJpaHotelRoomRepository springJpaHotelRoomRepository;

    JpaHotelRoomRepository(SpringJpaHotelRoomRepository springJpaHotelRoomRepository) {
        this.springJpaHotelRoomRepository = springJpaHotelRoomRepository;
    }

    @Override
    public void save(HotelRoom hotelRoom) {

    }
}
