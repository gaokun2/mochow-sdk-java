package com.baidu.mochow.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import com.baidu.mochow.model.entity.GeneralParams;
import com.baidu.mochow.model.entity.GeneralParamsSerializer;

@Getter
@Setter
@Builder
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class DeleteRequest extends AbstractMochowRequest {
    private String database;
    private String table;

    @JsonSerialize(using=GeneralParamsSerializer.class)
    private GeneralParams primaryKey;

    @JsonSerialize(using=GeneralParamsSerializer.class)
    private GeneralParams partitionKey;

    private String filter;
}