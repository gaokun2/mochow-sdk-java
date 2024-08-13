package com.baidu.mochow.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class SearchParams {
    private int limit;

    public SearchParams() {
    }
}