package com.baidu.mochow.model;

import com.baidu.mochow.model.entity.Row;

import java.util.List;

public class UpsertRequest extends InsertRequest {
    public UpsertRequest(String database, String table, List<Row> rows) {
        super(database, table, rows);
    }
}