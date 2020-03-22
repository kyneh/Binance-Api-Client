package com.binance.api.client.domain.lending;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public enum RedemptionType {
    FAST,
    NORMAL
}
