package com.banking.paymentService.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long accountId;
    private String payeeName;
    private String payeeAccountNumber;
    private Double amount;
    private LocalDateTime paymentDate;
    private String paymentStatus; // SUCCESS, FAILED, PENDING
    private String referenceNumber;
}
