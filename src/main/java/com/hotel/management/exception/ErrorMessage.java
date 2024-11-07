package com.hotel.management.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.http.HttpStatus;
import java.util.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class ErrorMessage {

    private int httpStatus;
    private Date date;
    private String message;
}
