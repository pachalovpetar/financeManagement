package com.example.financeManagement.repository;

import com.example.financeManagement.entity.SpendingRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SpendingRecordRepository extends JpaRepository<SpendingRecord, UUID> {
}
