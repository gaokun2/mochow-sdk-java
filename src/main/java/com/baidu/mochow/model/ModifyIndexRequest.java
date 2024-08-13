package com.baidu.mochow.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import com.baidu.mochow.model.entity.IndexField;

@Getter
@Setter
@Builder
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ModifyIndexRequest extends AbstractMochowRequest {
    private String database;
    private String table;
    private IndexField index;
}