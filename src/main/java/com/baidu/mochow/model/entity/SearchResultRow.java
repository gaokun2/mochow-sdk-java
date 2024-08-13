package com.baidu.mochow.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SearchResultRow {
    private Row row;
    private float distance;
}