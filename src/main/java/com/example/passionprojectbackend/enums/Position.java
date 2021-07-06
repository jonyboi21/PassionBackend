package com.example.passionprojectbackend.enums;

import com.sun.istack.NotNull;

public enum Position {

    PG("PG"),
    SG("SG"),
    SF("SF"),
    PF("PF"),
    C("C");

    @NotNull
    private final String position;

    Position(String position) {
        this.position = position;
    }
    public String getPosition(){
        return position;
    }
}
