package com.binance.api.client.domain.lending;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LendingAccount {

    private String totalAmountInBTC;
    private String totalAmountInUSDT;
    private String totalFixedAmountInBTC;
    private String totalFixedAmountInUSDT;
    private String totalFlexibleInBTC;
    private String totalFlexibleInUSDT;

    @JsonProperty("positionAmountVos")
    private List<PositionAmount> positionAmountVos;

    public String getTotalAmountInBTC() {
        return totalAmountInBTC;
    }

    public void setTotalAmountInBTC(String totalAmountInBTC) {
        this.totalAmountInBTC = totalAmountInBTC;
    }

    public String getTotalAmountInUSDT() {
        return totalAmountInUSDT;
    }

    public void setTotalAmountInUSDT(String totalAmountInUSDT) {
        this.totalAmountInUSDT = totalAmountInUSDT;
    }

    public String getTotalFixedAmountInBTC() {
        return totalFixedAmountInBTC;
    }

    public void setTotalFixedAmountInBTC(String totalFixedAmountInBTC) {
        this.totalFixedAmountInBTC = totalFixedAmountInBTC;
    }

    public String getTotalFixedAmountInUSDT() {
        return totalFixedAmountInUSDT;
    }

    public void setTotalFixedAmountInUSDT(String totalFixedAmountInUSDT) {
        this.totalFixedAmountInUSDT = totalFixedAmountInUSDT;
    }

    public String getTotalFlexibleInBTC() {
        return totalFlexibleInBTC;
    }

    public void setTotalFlexibleInBTC(String totalFlexibleInBTC) {
        this.totalFlexibleInBTC = totalFlexibleInBTC;
    }

    public String getTotalFlexibleInUSDT() {
        return totalFlexibleInUSDT;
    }

    public void setTotalFlexibleInUSDT(String totalFlexibleInUSDT) {
        this.totalFlexibleInUSDT = totalFlexibleInUSDT;
    }

    public List<PositionAmount> getPositionAmountVos() {
        return positionAmountVos;
    }

    public void setPositionAmountVos(List<PositionAmount> positionAmountVos) {
        this.positionAmountVos = positionAmountVos;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
                .append("totalAmountInBTC", totalAmountInBTC)
                .append("totalAmountInUSDT", totalAmountInUSDT)
                .append("totalFixedAmountInBTC", totalFixedAmountInBTC)
                .append("totalFixedAmountInUSDT", totalFixedAmountInUSDT)
                .append("totalFlexibleInBTC", totalFlexibleInBTC)
                .append("totalFlexibleInUSDT", totalFlexibleInUSDT)
                .append("positionAmountVos", positionAmountVos)
                .toString();
    }
}
