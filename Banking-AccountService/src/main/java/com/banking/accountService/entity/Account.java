package com.banking.accountService.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId; 
    private String accountNumber;
    private String accountType; // SAVINGS, CURRENT
    private Double balance;
    private String status; // ACTIVE, CLOSED
    private LocalDate createdAt;
}
