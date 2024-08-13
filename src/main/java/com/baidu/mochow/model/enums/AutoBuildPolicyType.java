package com.baidu.mochow.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AutoBuildPolicyType {
    TIMING("TIMING"),
    PERIODICAL("PERIODICAL"),
    ROW_COUNT_INCREMENT("ROW_COUNT_INCREMENT");

    private final String value;

    private AutoBuildPolicyType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}
