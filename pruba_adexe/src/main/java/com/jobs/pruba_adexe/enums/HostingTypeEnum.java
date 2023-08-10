package com.jobs.pruba_adexe.enums;

import lombok.Getter;

@Getter
public enum HostingTypeEnum {

    STANDARD("Standard"),
    PREMIUM("Premium"),
    VIP("Vip");

    private final String type;

    HostingTypeEnum(String type) {
        this.type = type;
    }
}
