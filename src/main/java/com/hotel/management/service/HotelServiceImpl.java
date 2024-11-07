package com.hotel.management.service;

import com.hotel.management.model.Hotel;
import com.hotel.management.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelServiceImpl implements HotelService{

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public Optional<Hotel> getHotelById(Long id) {
        return hotelRepository.findById(id);
    }

    @Override
    public List<Hotel> getAllHotelsByPostalCode(String postalCode) {
        return hotelRepository.findByPostalCode(postalCode);
    }

  /*  @Override
    public List<Hotel> getAllHotelsByCityId(Long cityId) {
        return hotelRepository.findByCityId(cityId);
    }*/

    /*
    @Override
    public List<Room> getRoomDetailsOfHotel() {
        return null;
    }

    @Override
    public List<User> bookRoom() {
        return null;
    }

    @Override
    public List<User> cancelRoom() {
        return null;
    }
     */
}
