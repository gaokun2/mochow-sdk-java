package com.baidu.mochow.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import com.baidu.mochow.model.entity.PartitionParams;
import com.baidu.mochow.model.entity.Schema;

@Getter
@Setter
@Builder
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class CreateTableRequest extends AbstractMochowRequest {
    private String database;
    private String table;
    private String description;
    private int replication;
    private PartitionParams partition;
    private boolean enableDynamicField;
    private Schema schema;
}