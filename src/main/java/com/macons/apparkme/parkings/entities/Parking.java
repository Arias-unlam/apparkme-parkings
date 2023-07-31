package com.macons.apparkme.parkings.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "parkings")
public class Parking {
    @Id
    private int id;

    private int userId;

    private String name;

    private String address;

    private String city;

    private String country;

    private String latitude;

    private String longitude;
}
