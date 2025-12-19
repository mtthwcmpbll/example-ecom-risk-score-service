package com.example.ecom.risk.service;

import com.example.ecom.risk.model.RiskCheckRequest;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class RiskScoreService {

    public void assessRisk(RiskCheckRequest request) {
        BigDecimal amount = request.getAmount();

        if (amount == null) {
            return;
        }

        if (amount.compareTo(new BigDecimal("100")) < 0) {
            request.setRiskScore("HIGH");
        } else if (amount.compareTo(new BigDecimal("1000")) < 0) {
            request.setRiskScore("MEDIUM");
        } else {
            request.setRiskScore("LOW");
        }
    }
}
