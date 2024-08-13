package com.baidu.mochow.model.entity;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.util.Map;

public class RowDeserializer extends JsonDeserializer<Row> {
    @Override
    public Row deserialize(JsonParser p, DeserializationContext ctx) throws IOException, JacksonException {
        Map<String, Object> fields = p.readValueAs(new TypeReference<Map<String,Object>>() {});
        return new Row(fields);
    }
}