package com.macons.apparkme.parkings.controller;

import com.macons.apparkme.parkings.dto.ParkingDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apparkme/api/parkings/v1")
public class ParkingController {

    @GetMapping("/parkings")
    public ResponseEntity getParkings(){
        ParkingDTO parkingDTO = ParkingDTO.builder()
                .id(12)
                .name("Roberto").address("av. robertario 123").build();
        return new ResponseEntity(parkingDTO, HttpStatus.OK);
    }
}
