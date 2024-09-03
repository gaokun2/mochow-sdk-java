package com.baidu.mochow.model.entity;

import com.baidu.mochow.model.enums.IndexState;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import com.baidu.mochow.model.enums.IndexType;
import com.baidu.mochow.model.enums.MetricType;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class VectorIndex extends IndexField {
    @Builder
    public VectorIndex(
            String indexName, String fieldName, IndexType indexType, IndexState state,
            MetricType metricType, IndexParams params, boolean autoBuild, AutoBuildPolicy autoBuildPolicy) {
        setIndexName(indexName);
        setField(fieldName);
        setIndexType(indexType);
        setState(state);
        setMetricType(metricType);
        setParams(params);
        setAutoBuild(autoBuild);
        setAutoBuildPolicy(autoBuildPolicy);
    }
}