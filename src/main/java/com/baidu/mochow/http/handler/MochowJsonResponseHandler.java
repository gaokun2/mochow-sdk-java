package com.baidu.mochow.http.handler;

import com.baidu.mochow.http.MochowHttpResponse;
import com.baidu.mochow.model.AbstractMochowResponse;
import com.baidu.mochow.util.JsonUtils;

import java.io.InputStream;

/**
 * HTTP body json response handler for Baidu Mochow responses.
 */
public class MochowJsonResponseHandler implements HttpResponseHandler {
    @Override
    public boolean handle(MochowHttpResponse httpResponse, AbstractMochowResponse response) throws Exception {
        InputStream content = httpResponse.getContent();
        if (content != null) {
            if (response.getMetadata().getContentLength() > 0) {
                JsonUtils.load(content, response);
            }
            content.close();
        }
        return true;
    }
}
