package com.framework;

public abstract class NormalAcc extends ShopAcc {

	protected final float deliveryCharges = 50;
	
//	Calling ShopAcc Constructor
	public NormalAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges);
	}
	
//	returning confirmation Order Placed
	@Override
	public void bookProduct(float price) {
		System.out.println("Your order is Placed"); 
	}

	@Override
	public String toString() {
		return "You are a Normal Member your delivery charges on any product is " + deliveryCharges + "\n" + super.toString();
	}

}

//*** lazy initialization remaining ***