package com.baidu.mochow.http;

/**
 * Common HTTP header values used throughout the Mochow Java client.
 */
public interface Headers {
    /*
     * Standard HTTP Headers
     */
    public static final String AUTHORIZATION = "Authorization";

    public static final String CONTENT_ENCODING = "Content-Encoding";

    public static final String CONTENT_LENGTH = "Content-Length";

    public static final String CONTENT_TYPE = "Content-Type";

    public static final String DATE = "Date";

    public static final String HOST = "Host";

    /*
     * Mochow common HTTP Headers
     */
    public static final String REQUEST_ID = "Request-ID";
}