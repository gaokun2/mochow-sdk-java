package com.baidu.mochow.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShowTableStatsResponse extends AbstractMochowResponse {
    private int rowCount;
    private int memorySizeInByte;
    private int diskSizeInByte;
}