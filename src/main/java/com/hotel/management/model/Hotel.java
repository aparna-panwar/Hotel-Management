package com.hotel.management.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
@Entity
public class Hotel {

    private long id;
    private String name;
    private String city;
    private String country;
    private String postalCode;
    private long phoneNumber;
    private double rating;
    private int noOfSingleRoom;
    private int noOfDoubleRoom;
}
