package com.baidu.mochow.model;

import com.baidu.mochow.model.entity.Schema;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AddFieldRequest extends AbstractMochowRequest {
    private String database;
    private String table;
    private Schema schema;
}

