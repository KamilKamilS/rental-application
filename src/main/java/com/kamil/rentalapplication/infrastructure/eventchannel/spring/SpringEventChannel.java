package com.kamil.rentalapplication.infrastructure.eventchannel.spring;

import com.kamil.rentalapplication.domain.apartment.ApartmentBooked;
import com.kamil.rentalapplication.domain.eventchannel.EventChannel;
import com.kamil.rentalapplication.domain.hotelroom.HotelRoomBooked;
import org.springframework.context.ApplicationEventPublisher;

public class SpringEventChannel implements EventChannel {
    private final ApplicationEventPublisher publisher;

    public SpringEventChannel(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public void publish(ApartmentBooked apartmentBooked) {
        publisher.publishEvent(apartmentBooked);
    }

    @Override
    public void publish(HotelRoomBooked hotelRoomBooked) {
        publisher.publishEvent(hotelRoomBooked);

    }
}
