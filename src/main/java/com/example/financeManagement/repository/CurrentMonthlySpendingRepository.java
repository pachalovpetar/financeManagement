package com.example.financeManagement.repository;

import com.example.financeManagement.entity.CurrentMonthlySpending;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CurrentMonthlySpendingRepository extends JpaRepository<CurrentMonthlySpending, UUID> {
}
