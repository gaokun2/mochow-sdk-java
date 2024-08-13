package com.baidu.mochow.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

import com.baidu.mochow.model.entity.PartitionParams;
import com.baidu.mochow.model.entity.Schema;

@Getter
@Setter
public class DescribeTableResponse extends AbstractMochowResponse {
    private String database;
    private String table;
    private String createTime;
    private String description;
    private int replication;
    private PartitionParams partition;
    private Boolean enableDynamicField;
    private String state;
    private List<String> aliases;
    private Schema schema;
}
