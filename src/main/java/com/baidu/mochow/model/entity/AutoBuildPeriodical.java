package com.baidu.mochow.model.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import com.baidu.mochow.model.enums.AutoBuildPolicyType;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AutoBuildPeriodical extends AutoBuildPolicy {
    public AutoBuildPeriodical(int periodInSecond) {
        super(AutoBuildPolicyType.PERIODICAL);
        setPeriodInSecond(periodInSecond);
    }

    public AutoBuildPeriodical(int periodInSecond, String timing) {
        super(AutoBuildPolicyType.PERIODICAL);
        setPeriodInSecond(periodInSecond);
        setTiming(timing);
    }
}