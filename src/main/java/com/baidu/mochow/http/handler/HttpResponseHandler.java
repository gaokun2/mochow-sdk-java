package com.baidu.mochow.http.handler;

import com.baidu.mochow.http.MochowHttpResponse;
import com.baidu.mochow.model.AbstractMochowResponse;

/**
 * Responsible for handling an HTTP response.
 */
public interface HttpResponseHandler {
    public boolean handle(MochowHttpResponse httpResponse, AbstractMochowResponse response) throws Exception;
}
