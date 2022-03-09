package com.framework;

public abstract class ShopFactory {
	
//	Abstract method to create new Prime Account
	public abstract PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime);
	
//  Abstract method to Create new Normal Account
	public abstract NormalAcc getNewNormalAccount(int accNo, String accNm, float charges, boolean isPrime);
	
}
