package com.kamil.rentalapplication.domain.eventchannel;

import com.kamil.rentalapplication.domain.apartment.ApartmentBooked;
import com.kamil.rentalapplication.domain.hotelroom.HotelRoomBooked;

public interface EventChannel {
    void publish(ApartmentBooked apartmentBooked);

    void publish(HotelRoomBooked hotelRoomBooked);
}
