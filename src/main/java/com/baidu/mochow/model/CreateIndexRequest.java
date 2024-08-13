package com.baidu.mochow.model;

import java.util.List;

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
public class CreateIndexRequest extends AbstractMochowRequest {
    private String database;
    private String table;
    private List<IndexField> indexes;
}