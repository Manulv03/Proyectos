package com.jobs.pruba_adexe.service;

import com.jobs.pruba_adexe.entity.Hotels;
import com.jobs.pruba_adexe.entity.HotelsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService {

    @Autowired
    private HotelsRepository hotelsRepository;

    public List<Hotels> getHotelsByRate(Long price1, Long price2) {

        List<Hotels> hotels = hotelsRepository.findAll();

        for (Hotels element : hotels) {

        }

        return null;
    }
}
