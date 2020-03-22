package com.binance.api.client.domain.lending;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LeftDailyRedemptionQuota {

    private String asset;
    private String dailyQuota;
    private String leftQuota;
    private String minRedemptionAmount;

    public String getAsset() {
        return asset;
    }

    public void setAsset(String asset) {
        this.asset = asset;
    }

    public String getDailyQuota() {
        return dailyQuota;
    }

    public void setDailyQuota(String dailyQuota) {
        this.dailyQuota = dailyQuota;
    }

    public String getLeftQuota() {
        return leftQuota;
    }

    public void setLeftQuota(String leftQuota) {
        this.leftQuota = leftQuota;
    }

    public String getMinRedemptionAmount() {
        return minRedemptionAmount;
    }

    public void setMinRedemptionAmount(String minRedemptionAmount) {
        this.minRedemptionAmount = minRedemptionAmount;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
                .append("asset", asset)
                .append("dailyQuota", dailyQuota)
                .append("leftQuota", leftQuota)
                .append("minRedemptionAmount", minRedemptionAmount)
                .toString();
    }
}
