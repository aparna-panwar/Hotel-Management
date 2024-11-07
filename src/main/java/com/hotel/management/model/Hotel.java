package com.hotel.management.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
@Entity
@Table(name = "hotel")
public class Hotel {

    @Id
    private long id;
    private String name;

    @OneToOne
    @JoinColumn(name="city_id")
    private City city;
    private String country;
    private String postalCode;
    private long phoneNumber;
    private double rating;
    private int noOfSingleRoom;
    private int noOfDoubleRoom;
}
