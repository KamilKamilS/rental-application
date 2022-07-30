package com.kamil.rentalapplication.infrastructure.rest.api.hotelroom;

import com.kamil.rentalapplication.application.hotelroom.HotelRoomApplicationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hotelroom")
public class HotelRoomRestController {
    private final HotelRoomApplicationService hotelRoomApplicationService;

    public HotelRoomRestController(HotelRoomApplicationService hotelRoomApplicationService) {
        this.hotelRoomApplicationService = hotelRoomApplicationService;
    }

    @PostMapping
    public void add(@RequestBody HotelRoomDTO hotelRoomDto) {
        hotelRoomApplicationService.add(hotelRoomDto.getHotelId(), hotelRoomDto.getNumber(), hotelRoomDto.getDescription()
        ,hotelRoomDto.getSpaceDefinition());
    }

    @PutMapping("/book/{id}")
    public void book(@PathVariable String id, @RequestBody HotelBookingDto hotelBookingDto) {
        hotelRoomApplicationService.book(id, hotelBookingDto.getTenantId(), hotelBookingDto.getDays());

    }
}
