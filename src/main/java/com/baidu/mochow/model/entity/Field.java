package com.baidu.mochow.model.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import com.baidu.mochow.model.enums.FieldType;

@Getter
@Setter
@Builder
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Field {
    private String fieldName;
    private FieldType fieldType;
    private Boolean primaryKey;
    private Boolean partitionKey;
    private Boolean autoIncrement;
    private Boolean notNull;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private int dimension;
}