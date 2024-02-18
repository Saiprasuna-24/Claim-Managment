package com.cts.entity;


import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Positive;

@Entity
public class Surveyor {
	@Id
	@Column(name="PK_SurveyorID")
	private int SurveyorId;
	private String FirstName;
	private String LastName;
	@Positive(message = "Estimate limit must be a positive")
	private int EstimateLimit;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="surveyor")
	private List<ClaimDetails> ClaimDetails;
	public int getSurveyorId() {
		return SurveyorId;
	}
	public void setSurveyorId(int surveyorId) {
		SurveyorId = surveyorId;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getEstimateLimit() {
		return EstimateLimit;
	}
	public void setEstimateLimit(int estimateLimit) {
		EstimateLimit = estimateLimit;
	}
	public List<ClaimDetails> getClaimDetails() {
		return ClaimDetails;
	}
	public void setClaimDetails(List<ClaimDetails> claimDetails) {
		ClaimDetails = claimDetails;
	} 
	
}
