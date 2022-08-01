package com.kamil.rentalapplication.infrastructure.persistence.jpa.apartmentbookinghistory;

import com.kamil.rentalapplication.domain.apartmentbookinghistory.ApartmentBookingHistory;
import org.springframework.data.repository.CrudRepository;

interface SpringJpaApartmentBookingHistoryRepository extends CrudRepository<ApartmentBookingHistory, String> {
}
