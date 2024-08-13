package com.baidu.mochow.auth;

import lombok.Builder;
import lombok.Getter;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Default implementation of the Credentials interface that allows callers to pass in the account and apikey
 * in the constructor.
 */
@Builder
public class Credentials {
    /**
     * The user account name.
     */
    @Getter
    private final String account;

    /**
     * The apiKey.
     */
    @Getter
    private final String apiKey;

    public Credentials(String account, String apiKey) {
        checkNotNull(account, "account should not be null.");
        checkArgument(!account.isEmpty(), "account should not be empty.");
        checkNotNull(apiKey, "apiKey should not be null.");
        checkArgument(!apiKey.isEmpty(), "apiKey should not be empty.");
        this.account = account;
        this.apiKey = apiKey;
    }
}
