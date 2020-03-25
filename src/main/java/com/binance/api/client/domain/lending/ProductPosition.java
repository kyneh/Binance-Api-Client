package com.binance.api.client.domain.lending;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductPosition {

    private String annualInterestRate;
    private String asset;
    private String avgAnnualInterestRate;
    private boolean canRedeem;
    private String dailyInterestRate;
    private String freeAmount;
    private String freezeAmount;
    private String lockedAmount;
    private String productId;
    private String productName;
    private String redeemingAmount;
    private String totalAmount;
    private String totalInterest;

    public String getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(String annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public String getAsset() {
        return asset;
    }

    public void setAsset(String asset) {
        this.asset = asset;
    }

    public String getAvgAnnualInterestRate() {
        return avgAnnualInterestRate;
    }

    public void setAvgAnnualInterestRate(String avgAnnualInterestRate) {
        this.avgAnnualInterestRate = avgAnnualInterestRate;
    }

    public boolean isCanRedeem() {
        return canRedeem;
    }

    public void setCanRedeem(boolean canRedeem) {
        this.canRedeem = canRedeem;
    }

    public String getDailyInterestRate() {
        return dailyInterestRate;
    }

    public void setDailyInterestRate(String dailyInterestRate) {
        this.dailyInterestRate = dailyInterestRate;
    }

    public String getFreeAmount() {
        return freeAmount;
    }

    public void setFreeAmount(String freeAmount) {
        this.freeAmount = freeAmount;
    }

    public String getFreezeAmount() {
        return freezeAmount;
    }

    public void setFreezeAmount(String freezeAmount) {
        this.freezeAmount = freezeAmount;
    }

    public String getLockedAmount() {
        return lockedAmount;
    }

    public void setLockedAmount(String lockedAmount) {
        this.lockedAmount = lockedAmount;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getRedeemingAmount() {
        return redeemingAmount;
    }

    public void setRedeemingAmount(String redeemingAmount) {
        this.redeemingAmount = redeemingAmount;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getTotalInterest() {
        return totalInterest;
    }

    public void setTotalInterest(String totalInterest) {
        this.totalInterest = totalInterest;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
                .append("annualInterestRate", annualInterestRate)
                .append("asset", asset)
                .append("avgAnnualInterestRate", avgAnnualInterestRate)
                .append("canRedeem", canRedeem)
                .append("dailyInterestRate", dailyInterestRate)
                .append("freeAmount", freeAmount)
                .append("freezeAmount", freezeAmount)
                .append("lockedAmount", lockedAmount)
                .append("productId", productId)
                .append("productName", productName)
                .append("redeemingAmount", redeemingAmount)
                .append("totalAmount", totalAmount)
                .append("totalInterest", totalInterest)
                .toString();
    }
}

