package com.baidu.mochow.model.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PUCKSearchParams extends SearchParams {
    private int searchCoarseCount;

    private PUCKSearchParams(Builder builder) {
        setLimit(builder.limit);
        this.searchCoarseCount = builder.searchCoarseCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private int limit;
        private int searchCoarseCount;

        public Builder() {
            this.limit = 50;
        }

        public Builder limit(int limit) {
            this.limit = limit;
            return this;
        }

        public Builder searchCoarseCount(int searchCoarseCount) {
            this.searchCoarseCount = searchCoarseCount;
            return this;
        }

        public PUCKSearchParams build() {
            return new PUCKSearchParams(this);
        }
    }
}