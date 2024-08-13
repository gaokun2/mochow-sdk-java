package com.baidu.mochow.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import com.baidu.mochow.model.entity.GeneralParams;
import com.baidu.mochow.model.entity.GeneralParamsSerializer;
import com.baidu.mochow.model.enums.ReadConsistency;

@Getter
@Setter
@Builder
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class QueryRequest extends AbstractMochowRequest {
    private String database;
    private String table;

    @JsonSerialize(using= GeneralParamsSerializer.class)
    private GeneralParams primaryKey;

    @JsonSerialize(using=GeneralParamsSerializer.class)
    private GeneralParams partitionKey;

    List<String> projections;
    Boolean retrieveVector;
    ReadConsistency readConsistency;
}