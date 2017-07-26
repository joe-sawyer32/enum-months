package com.example.common;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Created by Joe on 7/25/17.
 */
public enum Month {
    JANUARY("January"),
    FEBRUARY("February"),
    MARCH("March"),
    APRIL("April"),
    MAY("May"),
    JUNE("June"),
    JULY("July"),
    AUGUST("August"),
    SEPTEMBER("September"),
    OCTOBER("October"),
    NOVEMBER("November"),
    DECEMBER("December");

    // FIELDS
    private String englishName;

    // CONSTRUCTORS
    Month(String englishName) {
        this.englishName = englishName;
    }

    // METHODS
    // getters
    @JsonValue
    public String getEnglishName() {
        return englishName;
    }
}
