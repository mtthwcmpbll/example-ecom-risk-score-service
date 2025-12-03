package com.example.ecom.risk.controller;

import com.example.ecom.common.dto.ApiResponse;
import com.example.ecom.risk.model.RiskCheckRequest;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/risk")
public class RiskScoreController {

    @Autowired
    private KieContainer kieContainer;

    @PostMapping("/assess")
    public ApiResponse<RiskCheckRequest> assessRisk(@RequestBody RiskCheckRequest request) {
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.insert(request);
        kieSession.fireAllRules();
        kieSession.dispose();
        return ApiResponse.success(request);
    }
}
