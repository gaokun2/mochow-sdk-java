package com.baidu.mochow.model;

import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import com.baidu.mochow.model.entity.Row;
import com.baidu.mochow.model.entity.GeneralParams;
import com.baidu.mochow.model.entity.GeneralParamsDeserializer;

public class SelectResponse extends AbstractMochowResponse {
    boolean isTruncated;

    @JsonDeserialize(using=GeneralParamsDeserializer.class)
    private GeneralParams nextMarker;

    private List<Row> rows;
}
