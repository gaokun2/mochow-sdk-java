package com.baidu.mochow.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum IndexType {
    FLAT("FLAT"),
    HNSW("HNSW"),
    PUCK("PUCK"),
    SECONDARY_INDEX("SECONDARY");

    private final String value;

    private IndexType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}