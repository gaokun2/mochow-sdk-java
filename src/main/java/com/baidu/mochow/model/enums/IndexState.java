package com.baidu.mochow.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum IndexState {
    INVALID("INVALID"),
    BUILDING("BUILDING"),
    NORMAL("NORMAL");

    private final String value;

    private IndexState(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}

