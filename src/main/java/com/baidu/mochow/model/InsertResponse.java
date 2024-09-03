package com.baidu.mochow.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InsertResponse extends AbstractMochowResponse {
    private int affectedCount;
}