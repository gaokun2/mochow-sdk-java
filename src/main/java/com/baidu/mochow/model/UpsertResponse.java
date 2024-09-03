package com.baidu.mochow.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpsertResponse extends AbstractMochowResponse {
    private int affectedCount;
}