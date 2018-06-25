package com.Table_Per_Concrete_Class_Hierarchy;

public class ChequeConcreteClass  extends PaymentConcreteClass{
	private String ChequeType;

	public String getChequeType() {
		return ChequeType;
	}

	public void setChequeType(String chequeType) {
		ChequeType = chequeType;
	}
	

}
