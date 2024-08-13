package com.baidu.mochow.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class RowField {
    private String name;
    private Object value;

    @JsonIgnore
    public String getStringValue() {
        return value.toString();
    }

    @Override
    public String toString() {
        return "RowField{" +
                "name=" + name +
                ", value=" + value.toString() +
                '}';
    }
}