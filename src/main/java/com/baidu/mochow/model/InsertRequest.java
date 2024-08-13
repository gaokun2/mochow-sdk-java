package com.baidu.mochow.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import com.baidu.mochow.model.entity.Row;

@Getter
@Setter
@Builder
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class InsertRequest extends AbstractMochowRequest {
    private String database;
    private String table;
    private List<Row> rows;
}