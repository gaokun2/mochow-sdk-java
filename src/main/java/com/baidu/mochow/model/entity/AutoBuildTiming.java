package com.baidu.mochow.model.entity;

import com.baidu.mochow.model.enums.AutoBuildPolicyType;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AutoBuildTiming extends AutoBuildPolicy {
    private String timing;
    public AutoBuildTiming(String timing) {
        super(AutoBuildPolicyType.TIMING);
        this.timing = timing;
    }
}
