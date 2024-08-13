package com.baidu.mochow.exception;

/**
 * Base exception class for any errors that occur on the client side when attempting to access a Mochow service API.
 *
 * @see MochowClientException
 */
public class MochowClientException extends RuntimeException {
    private static final long serialVersionUID = -9085416005820812953L;

    /**
     * Constructs a new MochowClientException with the specified detail message.
     *
     * @param message the detail error message.
     */
    public MochowClientException(String message) {
        super(message);
    }

    /**
     * Constructs a new MochowClientException with the specified detail message and the underlying cause.
     *
     * @param message the detail error message.
     * @param cause   the underlying cause of this exception.
     */
    public MochowClientException(String message, Throwable cause) {
        super(message, cause);
    }
}