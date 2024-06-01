package com.example.financeManagement.repository;

import com.example.financeManagement.entity.TotalBalance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TotalBalanceRepository extends JpaRepository<TotalBalance, UUID> {
}
