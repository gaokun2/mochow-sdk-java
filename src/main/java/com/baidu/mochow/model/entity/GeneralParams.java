package com.baidu.mochow.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class GeneralParams {
    private Map<String, Object> items;

    public GeneralParams() {
        this.items = new HashMap<>();
    }

    public GeneralParams(GeneralParams.Builder builder) {
        this.items = builder.items;
    }

    public Object get(String fieldName) {
        return this.items.get(fieldName);
    }

    public void add(String key, Object value) {
        this.items.put(key, value);
    }

    public static GeneralParams.Builder builder() {
        return new GeneralParams.Builder();
    }

    public static class Builder {
        private Map<String, Object> items;

        public Builder() {
            this.items = new HashMap<>();
        }

        public GeneralParams.Builder add(String key, Object value) {
            this.items.put(key, value);
            return this;
        }

        public GeneralParams build() {
            return new GeneralParams(this);
        }
    }
}