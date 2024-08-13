package com.baidu.mochow.auth;

import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

public class SignOptions {
    /**
     * The default sign options, which is {headersToSign:null, timestamp:null, expirationInSeconds:1800}.
     */
    public static final SignOptions DEFAULT = new SignOptions();

    public static final int DEFAULT_EXPIRATION_IN_SECONDS = 1800;

    /**
     * The set of headers to be signed.
     */
    @Setter
    private Set<String> headersToSign = null;

    /**
     * The time until the signature will expire.
     *
     */
    @Setter
    private int expirationInSeconds = DEFAULT_EXPIRATION_IN_SECONDS;

    /**
     * Add the key of headers to be signed.
     *
     * @param headerKey the key of headers to be signed.
     */
    public void addHeadersToSign(String headerKey) {
        if (this.headersToSign == null) {
            headersToSign = new HashSet<String>();
        }
        headersToSign.add(headerKey);
    }

    @Override
    public String toString() {
        return "SignOptions [\n  headersToSign=" + headersToSign + ",\n  expirationInSeconds=" + expirationInSeconds
                + "]";
    }
}