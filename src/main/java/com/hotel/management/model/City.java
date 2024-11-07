package com.hotel.management.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldNameConstants;

@Data
@Getter
@Setter
@ToString
@Entity
@Table(name = "city")
public class City {

    @Id
    private Long cityId;
    private String cityName;
}
