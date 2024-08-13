package com.baidu.mochow.model.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class HNSWParams implements IndexParams {
    @JsonProperty("M")
    private int m;
    private int efConstruction;

    public HNSWParams() {
    }

    public HNSWParams(int m, int efConstruction) {
        this.m = m;
        this.efConstruction = efConstruction;
    }

    @Override
    public String toString() {
        return "HNSWParams{" +
                "M=" + m +
                ", efConstruction=" + efConstruction +
                '}';
    }
}