package com.baidu.mochow.http;

import lombok.Getter;

/**
 * Represents the communication protocol to use when sending requests to Mochow.
 * Communication over HTTPS is the default, and is more secure than HTTP, which is why Mochow recommends using HTTPS. HTTPS
 * connections can use more system resources because of the extra work to encrypt network traffic, so the option to use
 * HTTP is available in case users need it.
 */
@Getter
public enum Protocol {

    /**
     * HTTP Protocol - Using the HTTP protocol is less secure than HTTPS, but can slightly reduce the system resources
     * used when communicating with Mochow.
     */
    HTTP("http", 80),

    /**
     * HTTPS Protocol - Using the HTTPS protocol is more secure than using the HTTP protocol, but may use slightly more
     * system resources. Mochow recommends using HTTPS for maximize security.
     */
    HTTPS("https", 443);

    /**
     * The protocol name.
     */
    private String protocol;

    private int defaultPort;

    private Protocol(String protocol, int defaultPort) {
        this.protocol = protocol;
        this.defaultPort = defaultPort;
    }

    /*
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {
        return this.protocol;
    }
}
