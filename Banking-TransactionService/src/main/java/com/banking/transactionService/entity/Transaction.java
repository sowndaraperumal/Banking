package com.banking.transactionService.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long accountId; 
    private String transactionType; // DEPOSIT, WITHDRAWAL, TRANSFER
    private Double amount;
    private LocalDateTime transactionDate;
    private String status; // SUCCESS, FAILED, PENDING
    private String referenceNumber;
}
