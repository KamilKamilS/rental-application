package com.kamil.rentalapplication.infrastructure.rest.api.hotelroom;

import com.kamil.rentalapplication.application.hotelroom.HotelRoomApplicationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
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
}
