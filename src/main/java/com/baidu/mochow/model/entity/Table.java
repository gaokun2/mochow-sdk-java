package com.baidu.mochow.model.entity;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import com.baidu.mochow.model.enums.TableState;

@Getter
@Setter
@NoArgsConstructor
public class Table {
    private String database;
    private String table;
    private String createTime;
    private String description;
    private int replication;
    private PartitionParams partition;
    private Boolean enableDynamicField;
    private TableState state;
    private List<String> aliases;
    private Schema schema;
}