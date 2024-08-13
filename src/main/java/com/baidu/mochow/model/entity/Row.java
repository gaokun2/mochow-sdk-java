package com.baidu.mochow.model.entity;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Row {
    private Map<String, Object> fields;

    public Row() {
    }

    public Row(Builder builder) {
        this.fields = builder.fields;
    }

    public Object getField(String fieldName) {
        return this.fields.get(fieldName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Map<String, Object> fields;

        public Builder() {
            this.fields = new HashMap<>();
        }

        public Builder addField(RowField field) {
            this.fields.put(field.getName(), field.getValue());
            return this;
        }

        public Row build() {
            return new Row(this);
        }
    }
}