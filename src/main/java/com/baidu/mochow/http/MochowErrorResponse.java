package com.baidu.mochow.http;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MochowErrorResponse {

    private String requestId;

    /**
     * The Mochow error code which represents the error type.
     */
    private int code;

    /**
     * The detail error message.
     *
     */
    private String msg;
}