package com.jobs.pruba_adexe.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.jobs.pruba_adexe.enums.HostingTypeEnum;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(schema = "hotels", name = "hotels")
public class Hotels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "hosting_type")
    @Enumerated(EnumType.STRING)
    private HostingTypeEnum hostingType;

    @Column(name = "city")
    private String city;

    @Column(name = "max_capacity")
    private Integer maxCapacity;

    @Column(name = "rooms_quantity")
    private Integer roomsQuantity;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "date_avalaible")
    private Date dateAvalaible;

}
