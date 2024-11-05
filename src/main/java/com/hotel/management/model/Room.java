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
public class Room {

    private int id;
    private String size;
    private String facing;
    private boolean isBalcony;
    private boolean isTV;
    private int noOfBed;
}
