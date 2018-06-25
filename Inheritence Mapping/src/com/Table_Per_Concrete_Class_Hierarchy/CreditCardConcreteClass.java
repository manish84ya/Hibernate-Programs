package com.Table_Per_Concrete_Class_Hierarchy;

public class CreditCardConcreteClass extends PaymentConcreteClass {

	private String CreditCardType;

	public String getCreditCardType() {
		return CreditCardType;
	}

	public void setCreditCardType(String creditCardType) {
		CreditCardType = creditCardType;
	}
	

}
