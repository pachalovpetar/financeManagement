package com.example.financeManagement.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "spending_records")
public class SpendingRecord {

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private User user;

    @Column(name = "limit_value", nullable = false)
    private Double limitValue;

    @Column(name = "value_spent", nullable = false)
    private Double valueSpent;

    @Column(name = "month", nullable = false)
    private String month;

    @Column(name = "year", nullable = false)
    private String year;
}
