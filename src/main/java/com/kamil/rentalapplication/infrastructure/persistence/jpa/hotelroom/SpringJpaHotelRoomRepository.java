package com.kamil.rentalapplication.infrastructure.persistence.jpa.hotelroom;

import com.kamil.rentalapplication.domain.hotelroom.HotelRoom;
import org.springframework.data.repository.CrudRepository;

interface SpringJpaHotelRoomRepository extends CrudRepository<HotelRoom, String> {
}
