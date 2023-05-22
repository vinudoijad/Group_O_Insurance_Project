package com.insurance.model;

import java.util.Date;

//Task 157 Design API to get user with multiple premium details from database--------> Vinayak
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userPremiumDetails")
public class GetPremiumDetails {

	/*
	 * id, premiumId, policyId,policyHolderName, InstallmentPremiumAmount,
	 * PolicyCommencementdate, PolicyScheduletable, PolicyName, planName, userName,
	 * premiumAmount
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int premiumId;
	private String policyId;
	private String policyHolderName;
	private float InstallmentPremiumAmount;
	private Date Policycommencementdate;
	private String Policyscheduletable;
	private String PolicyName;
	private String planName;
	private String userName;
	private float premiumAmount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPremiumId() {
		return premiumId;
	}

	public void setPremiumId(int premiumId) {
		this.premiumId = premiumId;
	}

	public String getPolicyId() {
		return policyId;
	}

	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}

	public String getPolicyHolderName() {
		return policyHolderName;
	}

	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}

	public float getInstallmentPremiumAmount() {
		return InstallmentPremiumAmount;
	}

	public void setInstallmentPremiumAmount(float installmentPremiumAmount) {
		InstallmentPremiumAmount = installmentPremiumAmount;
	}

	public Date getPolicycommencementdate() {
		return Policycommencementdate;
	}

	public void setPolicycommencementdate(Date policycommencementdate) {
		Policycommencementdate = policycommencementdate;
	}

	public String getPolicyscheduletable() {
		return Policyscheduletable;
	}

	public void setPolicyscheduletable(String policyscheduletable) {
		Policyscheduletable = policyscheduletable;
	}

	public String getPolicyName() {
		return PolicyName;
	}

	public void setPolicyName(String policyName) {
		PolicyName = policyName;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public float getPremiumAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(float premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

}