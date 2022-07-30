package com.kamil.rentalapplication.infrastructure.persistence.jpa.hotelroom;

import com.kamil.rentalapplication.domain.hotelroom.HotelRoomRepository;
import com.kamil.rentalapplication.domain.hotelroom.HotelRoom;

class JpaHotelRoomRepository implements HotelRoomRepository {
    private final SpringJpaHotelRoomRepository hotelRoomRepository;

    JpaHotelRoomRepository(SpringJpaHotelRoomRepository hotelRoomRepository) {
        this.hotelRoomRepository = hotelRoomRepository;
    }

    @Override
    public void save(HotelRoom hotelRoom) {

    }

    @Override
    public HotelRoom findById(String id) {
        return hotelRoomRepository.findById(id).get();
    }
}
