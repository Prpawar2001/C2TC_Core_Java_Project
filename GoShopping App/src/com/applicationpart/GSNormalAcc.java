package com.applicationpart;
import com.framework.*;

public class GSNormalAcc extends NormalAcc {

//	calling NormalAcc constructor
	public GSNormalAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
	}
	
//	calling NormalAcc bookProduct() with parameter price
	@Override
	public void bookProduct(float price) {
		super.bookProduct(price);
	}

	@Override
	public String toString() {
		return "Welcome to GoShopping\n" + super.toString();
	}
	
}
