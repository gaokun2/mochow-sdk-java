package com.baidu.mochow.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import com.baidu.mochow.model.enums.IndexState;
import com.baidu.mochow.model.enums.IndexType;
import com.baidu.mochow.model.enums.MetricType;

@Getter
@Setter
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class IndexField {
    private String indexName;
    private String field;
    private IndexType indexType;
    private IndexState state;

    // vector index
    private MetricType metricType;
    private IndexParams params;
    private Boolean autoBuild;
    private AutoBuildPolicy autoBuildPolicy;

    public IndexField() {
    }

    @JsonIgnore
    public boolean isVectorIndex() {
        return this.indexType.equals(IndexType.HNSW) || this.indexType.equals(IndexType.PUCK);
    }
}