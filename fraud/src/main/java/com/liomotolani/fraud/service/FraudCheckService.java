package com.liomotolani.fraud.service;


import com.liomotolani.fraud.dto.FraudCheckResponse;
import com.liomotolani.fraud.model.FraudCheckHistory;
import com.liomotolani.fraud.repository.FraudCheckHistoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class FraudCheckService {

    private final FraudCheckHistoryRepository repository;

    public FraudCheckResponse isFraudulent(Integer customerId) {
        repository.save(
                FraudCheckHistory.builder()
                        .customerId(customerId)
                        .isFraudster(false)
                        .createdAt(LocalDateTime.now())
                        .build()
        );
        return new FraudCheckResponse(false);
    }
}
