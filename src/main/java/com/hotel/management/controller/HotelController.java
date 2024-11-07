package com.hotel.management.controller;

import com.hotel.management.exception.ResourceNotFoundException;
import com.hotel.management.model.Hotel;
import com.hotel.management.model.Room;
import com.hotel.management.model.User;
import com.hotel.management.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HotelController {

    @Autowired
    private HotelService hotelService;


    @GetMapping("/hotels")
    public ResponseEntity<List<Hotel>> getAllHotels(@RequestParam(required = false) String postalCode) {

        List<Hotel> hotels = new ArrayList<>();

        if(postalCode == null) {
            hotelService.getAllHotels().forEach(hotels::add);
        } else {
            hotelService.getAllHotelsByPostalCode(postalCode).forEach(hotels::add);
        }

        if (hotels.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(hotels, HttpStatus.OK);
    }

    @GetMapping("/hotels/{id}")
    public ResponseEntity<Hotel> getHotelById(@PathVariable Long id) {

        Hotel hotel = hotelService.getHotelById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Invalid hotel id."));

        return new ResponseEntity<>(hotel, HttpStatus.OK);
    }

   /* @GetMapping("/hotels/city/{cityId}")
    public ResponseEntity<List<Hotel>> getAllHotelsByCityId(@PathVariable Long cityId) {
        return new ResponseEntity<>(hotelService.getAllHotelsByCityId(cityId), HttpStatus.OK);
    }*/

    /*
    @GetMapping
    public ResponseEntity<List<Room>> getRoomDetailsOfHotel() {}

    @PostMapping
    public ResponseEntity<List<User>> bookRoom() {}

    @PostMapping
    public ResponseEntity<List<User>> cancelRoom() {}
*/
}
