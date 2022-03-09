package com.framework;

public abstract class PrimeAcc extends ShopAcc {

	protected final float deliveryCharges = 0;
	
//	Calling ShopAcc Constructor
	public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges);
	}

//	returning confirmation Order Placed
	@Override
	public void bookProduct(float a) {
		System.out.println("Your order is Placed"); 
	}

	@Override
	public String toString() 
	{
		return "You are a Prime Member your delivery charges on any product is " + deliveryCharges + "\n" + super.toString();
	}
	
}
