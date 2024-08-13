package com.baidu.mochow.model.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class PUCKParams implements IndexParams {
    private int coarseClusterCount;
    private int fineClusterCount;

    public PUCKParams(int coarseClusterCount, int fineClusterCount) {
        this.coarseClusterCount = coarseClusterCount;
        this.fineClusterCount = fineClusterCount;
    }
}