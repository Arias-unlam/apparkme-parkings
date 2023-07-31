package com.macons.apparkme.parkings.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ParkingDTO {

    private int id;

    private int userId;

    private String name;

    private String address;

    private String city;

    private String country;

    private String latitude;

    private String longitude;
}
