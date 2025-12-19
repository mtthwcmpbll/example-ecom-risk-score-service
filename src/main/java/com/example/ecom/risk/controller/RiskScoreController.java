package com.example.ecom.risk.controller;

import com.example.ecom.common.dto.ApiResponse;
import com.example.ecom.risk.model.RiskCheckRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/risk")
public class RiskScoreController {

    @Autowired
    private com.example.ecom.risk.service.RiskScoreService riskScoreService;

    @PostMapping("/assess")
    public ApiResponse<RiskCheckRequest> assessRisk(@RequestBody RiskCheckRequest request) {
        riskScoreService.assessRisk(request);
        return ApiResponse.success(request);
    }
}
