package com.baidu.mochow.model.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import com.baidu.mochow.model.enums.AutoBuildPolicyType;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AutoBuildRowCountIncrement extends AutoBuildPolicy {
    public AutoBuildRowCountIncrement(int rowCountIncrement) {
        super(AutoBuildPolicyType.ROW_COUNT_INCREMENT);
        setRowCountIncrement(rowCountIncrement);
    }

    public AutoBuildRowCountIncrement(int rowCountIncrement, float rowCountIncrementRatio) {
        super(AutoBuildPolicyType.ROW_COUNT_INCREMENT);
        setRowCountIncrement(rowCountIncrement);
        setRowCountIncrementRatio(rowCountIncrementRatio);
    }
}
