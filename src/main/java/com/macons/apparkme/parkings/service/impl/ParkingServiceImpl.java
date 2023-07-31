package com.macons.apparkme.parkings.service.impl;

import com.macons.apparkme.parkings.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ParkingServiceImpl implements ParkingService {
    private final RestTemplate restTemplate;

    @Autowired
    public ParkingServiceImpl (RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

}
