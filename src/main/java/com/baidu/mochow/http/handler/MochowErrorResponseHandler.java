package com.baidu.mochow.http.handler;

import java.io.InputStream;

import org.apache.http.HttpStatus;

import com.baidu.mochow.http.MochowErrorResponse;
import com.baidu.mochow.exception.MochowServiceException;
import com.baidu.mochow.exception.MochowServiceException.ErrorType;
import com.baidu.mochow.http.MochowHttpResponse;
import com.baidu.mochow.model.AbstractMochowResponse;
import com.baidu.mochow.util.JsonUtils;

/**
 * HTTP error response handler for Baidu Mochow responses.
 */
public class MochowErrorResponseHandler implements HttpResponseHandler {
    @Override
    public boolean handle(MochowHttpResponse httpResponse, AbstractMochowResponse response) throws Exception {
        if (httpResponse.getStatusCode() / 100 == HttpStatus.SC_OK / 100) {
            return false;
        }
        MochowServiceException bse = null;
        InputStream content = httpResponse.getContent();
        if (content != null) {
            MochowErrorResponse bceErrorResponse = JsonUtils.loadFrom(content, MochowErrorResponse.class);
            if (bceErrorResponse.getMsg() != null) {
                bse = new MochowServiceException(bceErrorResponse.getMsg());
                bse.setErrorCode(bceErrorResponse.getCode());
                bse.setRequestId(bceErrorResponse.getRequestId());
            }
            content.close();
        }
        if (bse == null) {
            bse = new MochowServiceException(httpResponse.getStatusText());
            bse.setRequestId(response.getMetadata().getRequestID());
        }
        bse.setStatusCode(httpResponse.getStatusCode());
        if (bse.getStatusCode() >= 500) {
            bse.setErrorType(ErrorType.Service);
        } else {
            bse.setErrorType(ErrorType.Client);
        }
        throw bse;
    }
}
