package com.baidu.mochow.model.entity;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.util.Map;

public class GeneralParamsSerializer extends JsonSerializer<GeneralParams> {
    @Override
    public void serialize(GeneralParams value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeStartObject();
        for (Map.Entry<String, Object> entry : value.getItems().entrySet()) {
            gen.writeFieldName(entry.getKey());
            gen.writeObject(entry.getValue());
        }
        gen.writeEndObject();
    }
}