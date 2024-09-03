package com.baidu.mochow.model;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import com.baidu.mochow.model.entity.SearchResultRow;

@Getter
@Setter
@NoArgsConstructor
public class SearchResponse extends AbstractMochowResponse {
    private List<Float> searchVectorFloats;
    private List<SearchResultRow> rows;
}