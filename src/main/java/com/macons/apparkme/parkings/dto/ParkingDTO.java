package com.macons.apparkme.parkings.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
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
