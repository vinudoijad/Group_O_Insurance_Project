package com.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.SettlementDetails;

@Repository
public interface SettlementDetailsRepository extends JpaRepository<SettlementDetails, Integer>{

}