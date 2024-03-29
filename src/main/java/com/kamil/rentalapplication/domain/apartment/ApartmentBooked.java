package com.kamil.rentalapplication.domain.apartment;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class ApartmentBooked {
    private final String eventId;
    private final LocalDateTime eventCreationDateTime;
    private final String apartmentId;
    private final String ownerId;
    private final String tenantId;
    private final LocalDate periodStart;
    private final LocalDate periodEnd;

    public ApartmentBooked(String eventId, LocalDateTime eventCreationDateTime, String apartmentId, String ownerId, String tenantId, Period period) {
        this.eventId = eventId;
        this.eventCreationDateTime = eventCreationDateTime;
        this.apartmentId = apartmentId;
        this.ownerId = ownerId;
        this.tenantId = tenantId;
        this.periodStart = period.getStart();
        this.periodEnd = period.getEnd();
    }

    public static ApartmentBooked create(String apartmentId, String ownerId, String tenantId, Period period) {
        String eventId = UUID.randomUUID().toString();
        LocalDateTime eventCreationDateTime = LocalDateTime.now();

        return new ApartmentBooked(eventId, eventCreationDateTime, apartmentId, ownerId, tenantId, period);
    }

    public String getEventId() {
        return eventId;
    }

    public LocalDateTime getEventCreationDateTime() {
        return eventCreationDateTime;
    }

    public String getApartmentId() {
        return apartmentId;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public String getTenantId() {
        return tenantId;
    }

    public LocalDate getPeriodStart() {
        return periodStart;
    }

    public LocalDate getPeriodEnd() {
        return periodEnd;
    }
}
