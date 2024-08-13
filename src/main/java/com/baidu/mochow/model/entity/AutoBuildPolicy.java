package com.baidu.mochow.model.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import com.baidu.mochow.model.enums.AutoBuildPolicyType;

@Setter
@Getter
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AutoBuildPolicy {
    private AutoBuildPolicyType policyType;

    public AutoBuildPolicy(AutoBuildPolicyType policyType) {
        this.policyType = policyType;
    }
}
