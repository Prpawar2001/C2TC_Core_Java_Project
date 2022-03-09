package com.applicationpart;
import com.framework.*;

public class GSPrimeAcc extends PrimeAcc {
	
//	calling PrimeAcc constructor
	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
	}	

//	calling PrimeAcc bookProduct() with parameter price
	@Override
	public void bookProduct(float price) {
		super.bookProduct(price);
	}

	@Override
	public String toString() {
		return "Welcome to GoShopping\n" + super.toString();
	}
	
}
