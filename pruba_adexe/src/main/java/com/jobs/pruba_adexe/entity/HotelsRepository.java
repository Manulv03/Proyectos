package com.jobs.pruba_adexe.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface HotelsRepository extends JpaRepository<Hotels, Integer> {

    @Query(value = "SELECT * FROM hotels.hotels WHERE date_avalaible BETWEEN ?1 AND ?2", nativeQuery = true)
    List<Hotels> findByInitialDateAndFinalDate(String initialDate, String finalDate);
}
