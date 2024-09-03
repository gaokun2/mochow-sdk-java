package com.baidu.mochow.model.entity;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import com.fasterxml.jackson.annotation.JsonInclude;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Schema {
    private List<Field> fields;
    private List<IndexField> indexes;

    private Schema(Builder builder) {
        this.fields = builder.fields;
        this.indexes = builder.indexes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private List<Field> fields;
        private List<IndexField> indexes;

        private Builder() {
            this.fields = new ArrayList<>();
            this.indexes = new ArrayList<>();
        }

        public Builder addField(Field field) {
            this.fields.add(field);
            return this;
        }

        public Builder addIndex(IndexField index) {
            this.indexes.add(index);
            return this;
        }

        public Schema build() {
            return new Schema(this);
        }
    }
}