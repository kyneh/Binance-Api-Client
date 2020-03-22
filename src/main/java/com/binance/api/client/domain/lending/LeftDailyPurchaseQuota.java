package com.binance.api.client.domain.lending;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LeftDailyPurchaseQuota {

    private String asset;
    private String leftQuota;

    public String getAsset() {
        return asset;
    }

    public void setAsset(String asset) {
        this.asset = asset;
    }

    public String getLeftQuota() {
        return leftQuota;
    }

    public void setLeftQuota(String leftQuota) {
        this.leftQuota = leftQuota;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
                .append("asset", asset)
                .append("leftQuota", leftQuota)
                .toString();
    }
}
