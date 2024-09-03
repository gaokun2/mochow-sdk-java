package com.baidu.mochow.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class BatchSearchResponse extends AbstractMochowResponse {
    private List<SearchResponse> results;
}