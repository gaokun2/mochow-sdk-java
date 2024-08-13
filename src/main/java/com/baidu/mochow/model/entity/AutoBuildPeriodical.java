package com.baidu.mochow.model.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import com.baidu.mochow.model.enums.AutoBuildPolicyType;

@Setter
@Getter
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AutoBuildPeriodical extends AutoBuildPolicy {
    private int periodInSecond;
    private String timing;

    public AutoBuildPeriodical(int periodInSecond) {
        super(AutoBuildPolicyType.PERIODICAL);
        this.periodInSecond = periodInSecond;
        this.timing = "";
    }

    public AutoBuildPeriodical(int periodInSecond, String timing) {
        super(AutoBuildPolicyType.PERIODICAL);
        this.periodInSecond = periodInSecond;
        this.timing = timing;
    }
}