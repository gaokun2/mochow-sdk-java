package com.baidu.mochow.model;

import lombok.Getter;

import com.baidu.mochow.model.entity.Row;

@Getter
public class QueryResponse extends AbstractMochowResponse {
    private Row row;
}