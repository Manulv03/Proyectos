package com.jobs.pruba_adexe.controllers;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.jobs.pruba_adexe.entity.Hotels;
import com.jobs.pruba_adexe.entity.HotelsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
public class HotelController {

    @Autowired
    private HotelsRepository hotelsRepository;

    @PostMapping("/save-hotel")
    public boolean save(@RequestBody Hotels hotelInfo) {
        hotelsRepository.save(hotelInfo);
        return true;
    }

    @GetMapping("/get-hotels")
    public List<Hotels> listAll() {
        return hotelsRepository.findAll();
    }

    @GetMapping("/get-by-id")
    public Optional<Hotels> getHotelById(@RequestParam Integer id) {
        return hotelsRepository.findById(id);
    }

    @GetMapping("/get-between-ranges")
    public List<Hotels> getHotelBetweenDates(@RequestParam String initialDate,
                                             @RequestParam String finalDate) {
        return hotelsRepository.findByInitialDateAndFinalDate(initialDate, finalDate);
    }


}
