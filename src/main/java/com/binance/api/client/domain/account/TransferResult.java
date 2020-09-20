package com.binance.api.client.domain.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TransferResult {

    private String amount;
    private String fromAsset;
    private Long operateTime;
    private String serviceChargeAmount;
    private Long tranId;
    private String transferedAmount;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getFromAsset() {
        return fromAsset;
    }

    public void setFromAsset(String fromAsset) {
        this.fromAsset = fromAsset;
    }

    public Long getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Long operateTime) {
        this.operateTime = operateTime;
    }

    public String getServiceChargeAmount() {
        return serviceChargeAmount;
    }

    public void setServiceChargeAmount(String serviceChargeAmount) {
        this.serviceChargeAmount = serviceChargeAmount;
    }

    public Long getTranId() {
        return tranId;
    }

    public void setTranId(Long tranId) {
        this.tranId = tranId;
    }

    public String getTransferedAmount() {
        return transferedAmount;
    }

    public void setTransferedAmount(String transferedAmount) {
        this.transferedAmount = transferedAmount;
    }

    @Override
    public String toString() {
        return "TransferResult{" +
                "amount='" + amount + '\'' +
                ", fromAsset='" + fromAsset + '\'' +
                ", operateTime=" + operateTime +
                ", serviceChargeAmount='" + serviceChargeAmount + '\'' +
                ", tranId=" + tranId +
                ", transferedAmount='" + transferedAmount + '\'' +
                '}';
    }
}
