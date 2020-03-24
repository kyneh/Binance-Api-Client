package com.binance.api.client.domain.lending;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PositionAmount {

    private String amount;
    private String amountInBTC;
    private String amountInUSDT;
    private String asset;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAmountInBTC() {
        return amountInBTC;
    }

    public void setAmountInBTC(String amountInBTC) {
        this.amountInBTC = amountInBTC;
    }

    public String getAmountInUSDT() {
        return amountInUSDT;
    }

    public void setAmountInUSDT(String amountInUSDT) {
        this.amountInUSDT = amountInUSDT;
    }

    public String getAsset() {
        return asset;
    }

    public void setAsset(String asset) {
        this.asset = asset;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
                .append("amount", amount)
                .append("amountInBTC", amountInBTC)
                .append("amountInUSDT", amountInUSDT)
                .append("asset", asset)
                .toString();
    }
}
