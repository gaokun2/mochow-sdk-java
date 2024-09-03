package com.baidu.mochow.model.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import com.baidu.mochow.model.enums.AutoBuildPolicyType;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AutoBuildPolicy {
    private AutoBuildPolicyType policyType;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private int periodInSecond = 0;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String timing = "";
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private int rowCountIncrement = 0;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private float rowCountIncrementRatio = 0.0F;

    public AutoBuildPolicy(AutoBuildPolicyType policyType) {
        this.policyType = policyType;
    }
}
