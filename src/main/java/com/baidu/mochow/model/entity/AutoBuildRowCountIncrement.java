package com.baidu.mochow.model.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import com.baidu.mochow.model.enums.AutoBuildPolicyType;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AutoBuildRowCountIncrement extends AutoBuildPolicy {
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private int rowCountIncrement;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private float rowCountIncrementRatio;

    public AutoBuildRowCountIncrement(int rowCountIncrement) {
        super(AutoBuildPolicyType.ROW_COUNT_INCREMENT);
        this.rowCountIncrement = rowCountIncrement;
        this.rowCountIncrementRatio = 0.0f;
    }

    public AutoBuildRowCountIncrement(int rowCountIncrement, float rowCountIncrementRatio) {
        super(AutoBuildPolicyType.ROW_COUNT_INCREMENT);
        this.rowCountIncrement = rowCountIncrement;
        this.rowCountIncrementRatio = rowCountIncrementRatio;
    }
}
