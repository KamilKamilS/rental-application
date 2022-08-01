package com.kamil.rentalapplication.infrastructure.persistence.jpa.apartmentbookinghistory;

import com.kamil.rentalapplication.domain.apartmentbookinghistory.ApartmentBookingHistory;
import com.kamil.rentalapplication.domain.apartmentbookinghistory.ApartmentBookingHistoryRepository;

public class JpaApartmentBookingHistoryRepository implements ApartmentBookingHistoryRepository {
    private final SpringJpaApartmentBookingHistoryRepository bookingHistoryRepository;

    public JpaApartmentBookingHistoryRepository(SpringJpaApartmentBookingHistoryRepository bookingHistoryRepository) {
        this.bookingHistoryRepository = bookingHistoryRepository;
    }

    @Override
    public boolean existsFor(String apartmentId) {
        return bookingHistoryRepository.existsById(apartmentId);
    }

    @Override
    public ApartmentBookingHistory findFor(String apartmentId) {
        return bookingHistoryRepository.findById(apartmentId).get();
    }

    @Override
    public void save(ApartmentBookingHistory apartmentBookingHistory) {
        bookingHistoryRepository.save(apartmentBookingHistory);

    }
}
