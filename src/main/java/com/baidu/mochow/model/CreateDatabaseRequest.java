package com.baidu.mochow.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class CreateDatabaseRequest extends AbstractMochowRequest {
    private String database;

    public CreateDatabaseRequest(String databaseName) {
        this.database = databaseName;
    }
}
