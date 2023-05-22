package com.insurance.repository;

import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.GetPremiumDetails;

@Repository
public interface GetPremiumDetailsRepository extends CrudRepository<GetPremiumDetails, Serializable> {

	public GetPremiumDetails findById(Integer Id);
}