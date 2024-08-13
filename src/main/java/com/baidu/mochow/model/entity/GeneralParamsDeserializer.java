package com.baidu.mochow.model.entity;

import java.io.IOException;
import java.util.Map;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

public class GeneralParamsDeserializer extends JsonDeserializer<GeneralParams> {
    @Override
    public GeneralParams deserialize(JsonParser p, DeserializationContext ctx) throws IOException, JacksonException {
        Map<String, Object> items = p.readValueAs(new TypeReference<Map<String,Object>>() {});
        return new GeneralParams(items);
    }
}
