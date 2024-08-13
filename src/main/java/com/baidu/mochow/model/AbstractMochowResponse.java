package com.baidu.mochow.model;

import java.io.Serializable;

import com.baidu.mochow.http.MochowResponseMetadata;

/**
 * Represents the response from an Mochow service, including the result payload and any response metadata. Mochow response
 * metadata consists primarily of the Mochow request ID, which can be used for debugging purposes when services aren't
 * acting as expected.
 */
public class AbstractMochowResponse implements Serializable {

    protected MochowResponseMetadata metadata = new MochowResponseMetadata();

    public MochowResponseMetadata getMetadata() {
        return this.metadata;
    }
}