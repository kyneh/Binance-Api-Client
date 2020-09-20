package com.binance.api.client.domain.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DustTransferResult {

    private String totalServiceCharge;
    private String totalTransfered;
    private List<TransferResult> transferResult;

    public String getTotalServiceCharge() {
        return totalServiceCharge;
    }

    public void setTotalServiceCharge(String totalServiceCharge) {
        this.totalServiceCharge = totalServiceCharge;
    }

    public String getTotalTransfered() {
        return totalTransfered;
    }

    public void setTotalTransfered(String totalTransfered) {
        this.totalTransfered = totalTransfered;
    }

    public List<TransferResult> getTransferResult() {
        return transferResult;
    }

    public void setTransferResult(List<TransferResult> transferResult) {
        this.transferResult = transferResult;
    }

    @Override
    public String toString() {
        return "DustTransferResult{" +
                "totalServiceCharge='" + totalServiceCharge + '\'' +
                ", totalTransfered='" + totalTransfered + '\'' +
                ", transferResult=" + transferResult +
                '}';
    }
}
