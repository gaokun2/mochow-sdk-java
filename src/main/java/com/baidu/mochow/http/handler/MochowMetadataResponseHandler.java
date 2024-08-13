package com.baidu.mochow.http.handler;

import com.baidu.mochow.http.MochowResponseMetadata;
import com.baidu.mochow.http.MochowHttpResponse;
import com.baidu.mochow.http.Headers;
import com.baidu.mochow.model.AbstractMochowResponse;

/**
 * HTTP response handler for Baidu Mochow responses. Provides common utilities that other specialized Mochow response
 * handlers need to share such as pulling common response metadata (ex: request IDs) out of headers.
 */
public class MochowMetadataResponseHandler implements HttpResponseHandler {
    @Override
    public boolean handle(MochowHttpResponse httpResponse, AbstractMochowResponse response) throws Exception {
        MochowResponseMetadata metadata = response.getMetadata();
        metadata.setRequestID(httpResponse.getHeader(Headers.REQUEST_ID));
        metadata.setContentLength(httpResponse.getHeaderAsLong(Headers.CONTENT_LENGTH));
        metadata.setContentType(httpResponse.getHeader(Headers.CONTENT_TYPE));
        return false;
    }
}
