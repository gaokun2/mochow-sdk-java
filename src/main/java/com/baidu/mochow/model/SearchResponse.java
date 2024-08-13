package com.baidu.mochow.model;

import java.util.List;

import com.baidu.mochow.model.entity.SearchResultRow;

public class SearchResponse extends AbstractMochowResponse {
    private List<Float> searchVectorFloats;
    private List<SearchResultRow> rows;
}