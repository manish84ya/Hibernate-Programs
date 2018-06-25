package com.Table_Per_Subclass_Hierarchy;

public class ChequeDTO extends PaymentDTO 
{
	private String ChequeType;

	public String getChequeType() {
		return ChequeType;
	}

	public void setChequeType(String chequeType) {
		ChequeType = chequeType;
	}
	

}
