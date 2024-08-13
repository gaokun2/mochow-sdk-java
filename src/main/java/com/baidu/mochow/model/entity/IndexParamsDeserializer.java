package com.baidu.mochow.model.entity;

import java.io.IOException;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import com.baidu.mochow.util.JsonUtils;
import com.baidu.mochow.exception.MochowServiceException;

public class IndexParamsDeserializer extends JsonDeserializer<IndexParams> {
    @Override
    public IndexParams deserialize(JsonParser p, DeserializationContext ctxt)
            throws IOException, JacksonException {
        String paramStr = p.getCodec().readTree(p).toString();
        Object o = p.getCurrentValue();
        if (o instanceof IndexField) {
            IndexField indexField = (IndexField) o;
            if (indexField.isVectorIndex()) {
                IndexParams params = null;
                switch (indexField.getIndexType()) {
                    case HNSW:
                        params = JsonUtils.fromJsonString(paramStr, HNSWParams.class);
                        break;
                    case PUCK:
                        params = JsonUtils.fromJsonString(paramStr, PUCKParams.class);
                        break;
                }
                return params;
            }
        }
        throw new MochowServiceException("deserialize IndexField exception, expect IndexField class, actually value is "
                + o.toString());
    }
}
