package com.baidu.mochow.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TableState {
    INVALID("INVALID"),
    CREATING("CREATING"),
    NORMAL("NORMAL"),
    DELETING("DELETING");

    private final String value;

    private TableState(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}
