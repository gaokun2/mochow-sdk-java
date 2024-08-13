package com.baidu.mochow.model;

import lombok.Getter;
import lombok.Setter;

import com.baidu.mochow.model.entity.IndexField;

@Getter
@Setter
public class DescribeIndexResponse extends AbstractMochowResponse {
    private IndexField index;
}