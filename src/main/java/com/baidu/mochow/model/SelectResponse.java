package com.baidu.mochow.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import lombok.Getter;

import com.baidu.mochow.model.entity.Row;
import com.baidu.mochow.model.entity.GeneralParams;
import com.baidu.mochow.model.entity.GeneralParamsDeserializer;

@Getter
public class SelectResponse extends AbstractMochowResponse {
    @JsonProperty("isTruncated")
    private boolean truncated;

    @JsonDeserialize(using=GeneralParamsDeserializer.class)
    private GeneralParams nextMarker;

    private List<Row> rows;
}
