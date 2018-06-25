package com.Table_Per_Subclass_Hierarchy;

public class CreditCardDTO extends PaymentDTO
{
	private String CreditCardType;

	public String getCreditCardType() {
		return CreditCardType;
	}

	public void setCreditCardType(String creditCardType) {
		CreditCardType = creditCardType;
	}
	

}
