package com.hotel.management.repository;

import com.hotel.management.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {
    Optional<Hotel> findById(Long id);
    List<Hotel> findByPostalCode(String postalCode);

    //List<Hotel> findByCityId(Long cityId);

}
