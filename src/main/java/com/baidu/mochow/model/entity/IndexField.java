package com.baidu.mochow.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import com.baidu.mochow.model.enums.IndexState;
import com.baidu.mochow.model.enums.IndexType;
import com.baidu.mochow.model.enums.MetricType;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class IndexField {
    private String indexName;
    private String field;
    private IndexType indexType;
    private IndexState state;

    // vector index
    private MetricType metricType;
    @JsonDeserialize(using=IndexParamsDeserializer.class)
    private IndexParams params;

    // auto build
    private boolean autoBuild = false;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private AutoBuildPolicy autoBuildPolicy = null;

    @JsonIgnore
    public boolean isVectorIndex() {
        return this.indexType.equals(IndexType.HNSW) || this.indexType.equals(IndexType.PUCK);
    }
}