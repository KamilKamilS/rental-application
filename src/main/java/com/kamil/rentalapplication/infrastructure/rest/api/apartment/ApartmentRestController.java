package com.kamil.rentalapplication.infrastructure.rest.api.apartment;

import com.kamil.rentalapplication.application.apartment.ApartmentApplicationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apartment")
public class ApartmentRestController {
    private final ApartmentApplicationService apartmentApplicationService;

    public ApartmentRestController(ApartmentApplicationService apartmentApplicationService) {
        this.apartmentApplicationService = apartmentApplicationService;
    }

    @PostMapping
    public void add(@RequestBody ApartmentDTO apartmentDto) {
        apartmentApplicationService.add(apartmentDto.getOwnerId(), apartmentDto.getStreet(), apartmentDto.getPostalCode(),
                 apartmentDto.getHouseNumber(), apartmentDto.getApartmentNumber(), apartmentDto.getCity(), apartmentDto.getCountry(),
                apartmentDto.getDescription(), apartmentDto.getRoomsDefinition());
    }

    @PutMapping("/book/{id}")
    public void book(@PathVariable String id, @RequestBody ApartmentBookingDto apartmentBookingDto) {
        apartmentApplicationService.book(
                id, apartmentBookingDto.getTenantId(), apartmentBookingDto.getStart(), apartmentBookingDto.getEnd());
    }
}
