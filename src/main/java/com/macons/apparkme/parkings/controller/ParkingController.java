package com.macons.apparkme.parkings.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/apparkme/api/parkings-v1")
public class ParkingController {

    @GetMapping("/parkings")
    public ResponseEntity getParkings(){
        return new ResponseEntity(HttpStatus.OK);
    }
}
