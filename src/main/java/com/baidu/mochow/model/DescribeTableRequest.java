package com.baidu.mochow.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class DescribeTableRequest extends AbstractMochowRequest {
    private String database;
    private String table;
}
