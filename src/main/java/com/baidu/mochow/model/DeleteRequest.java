package com.baidu.mochow.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import com.baidu.mochow.model.entity.GeneralParams;
import com.baidu.mochow.model.entity.GeneralParamsSerializer;

@Getter
@Setter
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class DeleteRequest extends AbstractMochowRequest {
    private String database;
    private String table;
    private String filter;

    @JsonSerialize(using=GeneralParamsSerializer.class)
    private GeneralParams primaryKey;

    @JsonSerialize(using=GeneralParamsSerializer.class)
    private GeneralParams partitionKey;

    public DeleteRequest(Builder builder) {
        this.database = builder.database;
        this.table = builder.table;
        this.filter = builder.filter;
        this.primaryKey = builder.primaryKey;
        this.partitionKey = builder.partitionKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String database;
        private String table;
        private GeneralParams primaryKey;
        private GeneralParams partitionKey;
        private String filter;

        public Builder() {
        }

        public Builder database(String database) {
            this.database = database;
            return this;
        }

        public Builder table(String table) {
            this.table = table;
            return this;
        }

        public Builder primaryKey(GeneralParams primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }

        public Builder addPrimaryKey(String key, Object value) {
            if (this.primaryKey == null) {
                this.primaryKey = new GeneralParams();
            }
            this.primaryKey.add(key, value);
            return this;
        }

        public Builder partitionKey(GeneralParams partitionKey) {
            this.partitionKey = partitionKey;
            return this;
        }

        public Builder addPartitionKey(String key, Object value) {
            if (this.partitionKey == null) {
                this.partitionKey = new GeneralParams();
            }
            this.partitionKey.add(key, value);
            return this;
        }

        public Builder filter(String filter) {
            this.filter = filter;
            return this;
        }

        public DeleteRequest build() {
            return new DeleteRequest(this);
        }
    }
}