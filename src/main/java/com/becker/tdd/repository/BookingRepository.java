package com.becker.tdd.repository;

import com.becker.tdd.model.BookingModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookingRepository extends JpaRepository<BookingModel, String> {

    Optional<BookingModel> findByReserveName(String name);
}
