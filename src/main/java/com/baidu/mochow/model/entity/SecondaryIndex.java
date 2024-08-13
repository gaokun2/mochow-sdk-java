package com.baidu.mochow.model.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import com.baidu.mochow.model.enums.IndexType;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class SecondaryIndex extends IndexField {
    public SecondaryIndex(String indexName, String fieldName) {
        setIndexName(indexName);
        setField(fieldName);
        setIndexType(IndexType.SECONDARY_INDEX);
    }
}