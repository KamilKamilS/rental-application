package com.kamil.rentalapplication.application.apartmentbookinghistory;

import com.kamil.rentalapplication.domain.apartment.ApartmentBooked;
import com.kamil.rentalapplication.domain.apartmentbookinghistory.ApartmentBooking;
import com.kamil.rentalapplication.domain.apartmentbookinghistory.ApartmentBookingHistory;
import com.kamil.rentalapplication.domain.apartmentbookinghistory.ApartmentBookingHistoryRepository;
import com.kamil.rentalapplication.domain.apartmentbookinghistory.BookingPeriod;
import org.springframework.context.event.EventListener;

public class ApartmentBookingHistoryEventListener {

    private final ApartmentBookingHistoryRepository apartmentBookingHistoryRepository;

    public ApartmentBookingHistoryEventListener(ApartmentBookingHistoryRepository apartmentBookingHistoryRepository) {
        this.apartmentBookingHistoryRepository = apartmentBookingHistoryRepository;
    }

    @EventListener
    public void consume(ApartmentBooked apartmentBooked) {
        ApartmentBookingHistory apartmentBookingHistory = getApartmentBookingHistory(apartmentBooked.getApartmentId());
        BookingPeriod bookingPeriod = new BookingPeriod(apartmentBooked.getPeriodStart(), apartmentBooked.getPeriodEnd());


        apartmentBookingHistory.add(ApartmentBooking.start(apartmentBooked.getEventCreationDateTime(),
                apartmentBooked.getOwnerId(), apartmentBooked.getTenantId(),
                bookingPeriod));

        apartmentBookingHistoryRepository.save(apartmentBookingHistory);
    }

    private ApartmentBookingHistory getApartmentBookingHistory(String apartmentId) {
        if (apartmentBookingHistoryRepository.existsFor(apartmentId)) {
            return apartmentBookingHistoryRepository.findFor(apartmentId);
        } else {
            return new ApartmentBookingHistory(apartmentId);
        }
    }
}
