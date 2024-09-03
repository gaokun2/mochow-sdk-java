package com.baidu.mochow.model.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import com.baidu.mochow.model.enums.AutoBuildPolicyType;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AutoBuildTiming extends AutoBuildPolicy {
    public AutoBuildTiming(String timing) {
        super(AutoBuildPolicyType.TIMING);
        setTiming(timing);
    }
}