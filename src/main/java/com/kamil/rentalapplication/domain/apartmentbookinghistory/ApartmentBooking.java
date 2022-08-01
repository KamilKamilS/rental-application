package com.kamil.rentalapplication.domain.apartmentbookinghistory;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
public class ApartmentBooking {
    private final BookingStep bookingStep;
    private final String ownerId;
    private final String tenantId;
    @Embedded
    private final BookingPeriod bookingPeriod;

    public ApartmentBooking(BookingStep bookingStep, LocalDateTime eventCreationDateTime, String ownerId, String tenantId, BookingPeriod bookingPeriod) {
        this.bookingStep = bookingStep;
        this.ownerId = ownerId;
        this.tenantId = tenantId;
        this.bookingPeriod = bookingPeriod;
    }

    public static ApartmentBooking start(LocalDateTime eventCreationDateTime, String ownerId, String tenantId, BookingPeriod bookingPeriod) {
        return new ApartmentBooking(BookingStep.START, eventCreationDateTime, ownerId, tenantId, bookingPeriod);

    }
}
