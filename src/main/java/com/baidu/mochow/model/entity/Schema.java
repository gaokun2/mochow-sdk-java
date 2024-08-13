package com.baidu.mochow.model.entity;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

import com.fasterxml.jackson.annotation.JsonInclude;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Schema {
    private List<Field> fields;
    private List<IndexField> indexes;
}