package com.kamil.rentalapplication.infrastructure.rest.api.hotel;

import com.kamil.rentalapplication.application.hotel.HotelApplicationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/hotel")
public class HotelRestController {
    private final HotelApplicationService hotelApplicationService;

    public HotelRestController(HotelApplicationService hotelApplicationService) {
        this.hotelApplicationService = hotelApplicationService;
    }

    @PostMapping
    public void add(@RequestBody HotelDTO hotelDto) {
        hotelApplicationService.add(hotelDto.getName(), hotelDto.getStreet(), hotelDto.getBuildingName(), hotelDto.getPostalCode(),
                hotelDto.getCity(), hotelDto.getCountr());
    }
}
