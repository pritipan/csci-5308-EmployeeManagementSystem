package com.empmanagement.dao;

import java.util.List;

import com.empmanagement.domain.ReimbursementDetails;

public interface IReimbursementDao {
	
	List<ReimbursementDetails> getReimbursementDetails();
	String getGrade(Long empID);
	int getBasicSalary(String grade);
	String getStatus(Long empId);
	String updateReimb(Long empId, String status);
	String updateAppliedReimbursement(Long empId, Long appliedReimbursementAmt);
	String updateApprovedAllowance(Long empId, int reimburseAmount);
}