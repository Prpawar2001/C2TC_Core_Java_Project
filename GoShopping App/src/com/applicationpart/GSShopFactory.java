package com.applicationpart;
import com.framework.*;

public class GSShopFactory extends ShopFactory{

//	method to create new prime account
	@Override
	public PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime) {
		GSPrimeAcc gsprime = new GSPrimeAcc(accNo, accNm, charges, isPrime);
		System.out.println(gsprime.toString());
		return gsprime;
	}

//	method to create new Normal account
	@Override
	public NormalAcc getNewNormalAccount(int accNo, String accNm, float charges, boolean isPrime) {
		GSNormalAcc gsnormal = new GSNormalAcc(accNo, accNm, charges, isPrime); 
		System.out.println(gsnormal.toString());	
		return gsnormal;
	}
	
}
