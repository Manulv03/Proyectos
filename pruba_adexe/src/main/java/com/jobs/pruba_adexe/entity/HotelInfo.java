package com.jobs.pruba_adexe.entity;

import com.jobs.pruba_adexe.enums.HostingTypeEnum;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(schema = "hotels", name = "hotel_info")
public class HotelInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Long price;

    private HostingTypeEnum hosting_type;

    private Date availability;
}
