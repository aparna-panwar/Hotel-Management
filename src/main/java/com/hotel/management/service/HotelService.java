package com.hotel.management.service;

import com.hotel.management.model.Hotel;
import com.hotel.management.model.Room;
import com.hotel.management.model.User;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


public interface HotelService {


     List<Hotel> getAllHotels();

     Optional<Hotel> getHotelById(Long id);

     List<Hotel> getAllHotelsByPostalCode(String postalCode);

     //List<Hotel> getAllHotelsByCityId(Long cityId);

    // List<Room> getRoomDetailsOfHotel();

   //  List<User> bookRoom();

    // List<User> cancelRoom();
}
