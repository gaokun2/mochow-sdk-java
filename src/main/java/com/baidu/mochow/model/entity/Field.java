package com.baidu.mochow.model.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import com.baidu.mochow.model.enums.FieldType;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
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