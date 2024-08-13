package com.baidu.mochow.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ReadConsistency {
    EVENTUAL("EVENTUAL"),
    STRONG("STRONG");

    private final String value;

    private ReadConsistency(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}
