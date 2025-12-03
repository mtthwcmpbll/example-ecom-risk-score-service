package com.example.ecom.risk.model;

import java.math.BigDecimal;

public class RiskCheckRequest {
    private BigDecimal amount;
    private String riskScore;

    public RiskCheckRequest() {
    }

    public RiskCheckRequest(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getRiskScore() {
        return riskScore;
    }

    public void setRiskScore(String riskScore) {
        this.riskScore = riskScore;
    }
}
