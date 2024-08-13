package com.baidu.mochow.model.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class PartitionParams {
    private String partitionType;
    private int partitionNum;

    public PartitionParams(String partitionType, int partitionNum) {
        this.partitionType = partitionType;
        this.partitionNum = partitionNum;
    }
}