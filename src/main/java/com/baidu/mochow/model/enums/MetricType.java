package com.baidu.mochow.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum MetricType {
    L2("L2"),
    IP("IP"),
    COSINE("COSINE");

    private final String value;

    private MetricType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}
