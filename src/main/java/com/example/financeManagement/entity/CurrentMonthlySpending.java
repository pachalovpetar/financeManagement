package com.example.financeManagement.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "current_monthly_spending")
public class CurrentMonthlySpending {

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private User user;

    @Column(name = "limit_value", nullable = false)
    private Double limitValue;

    @Column(name = "is_active", nullable = false)
    private Boolean isActive;
}
