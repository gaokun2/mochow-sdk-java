package com.baidu.mochow.model.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FLATSearchParams extends SearchParams {
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private float distanceNear;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private float distanceFar;

    private FLATSearchParams(Builder builder) {
        setLimit(builder.limit);
        this.distanceNear = builder.distanceNear;
        this.distanceFar = builder.distanceFar;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private int limit;
        private float distanceNear;
        private float distanceFar;

        public Builder() {
            this.limit = 50;
        }

        public Builder limit(int limit) {
            this.limit = limit;
            return this;
        }

        public Builder distanceNear(float distanceNear) {
            this.distanceNear = distanceNear;
            return this;
        }

        public Builder distanceFar(float distanceFar) {
            this.distanceFar = distanceFar;
            return this;
        }

        public FLATSearchParams build() {
            return new FLATSearchParams(this);
        }
    }
}