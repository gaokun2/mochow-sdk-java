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
public class UpdateRequest extends AbstractMochowRequest {
    private String database;
    private String table;

    @JsonSerialize(using= GeneralParamsSerializer.class)
    private GeneralParams primaryKey;

    @JsonSerialize(using=GeneralParamsSerializer.class)
    private GeneralParams partitionKey;

    @JsonSerialize(using=GeneralParamsSerializer.class)
    private GeneralParams update;

    public UpdateRequest(Builder builder) {
        this.database = builder.database;
        this.table = builder.table;
        this.primaryKey = builder.primaryKey;
        this.partitionKey = builder.partitionKey;
        this.update = builder.update;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String database;
        private String table;
        private GeneralParams primaryKey;
        private GeneralParams partitionKey;
        private GeneralParams update;

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

        public Builder addPrimaryKey(String key, Object value) {
            if (this.primaryKey == null) {
                this.primaryKey = new GeneralParams();
            }
            this.primaryKey.add(key, value);
            return this;
        }

        public Builder primaryKey(GeneralParams primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }

        public Builder addPartitionKey(String key, Object value) {
            if (this.partitionKey == null) {
                this.partitionKey = new GeneralParams();
            }
            this.partitionKey.add(key, value);
            return this;
        }

        public Builder partitionKey(GeneralParams partitionKey) {
            this.partitionKey = partitionKey;
            return this;
        }

        public Builder addUpdate(String key, Object value) {
            if (this.update == null) {
                this.update = new GeneralParams();
            }
            this.update.add(key, value);
            return this;
        }

        public Builder update(GeneralParams update) {
            this.update = update;
            return this;
        }

        public UpdateRequest build() {
            return new UpdateRequest(this);
        }
    }
}