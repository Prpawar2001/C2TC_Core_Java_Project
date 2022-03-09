package com.framework;

import com.applicationpart.GSNormalAcc;
import com.applicationpart.GSPrimeAcc;
import com.applicationpart.GSShopFactory;
import java.util.Scanner;

public abstract class ShopAcc {
	
//	Initialized private variables to keep details
	private int accNo;
	private String accNm;
	private float charges;
		
//	constructor to save details in private variables taken from user
	public ShopAcc(int accNo, String accNm, float charges) {
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;
	}

//	abstract bookProduct()
	public abstract void bookProduct(float a);
	
//	method to display items
	public void items(float x)
	{
		System.out.println("1.Mobile - 10000 \n2.Laptop - 50000 \n3.watch - 2000 \n4.shirt - 800 \n5.T-shirt - 400\n");
	}
	
//	method to make an order
	int order() {
		int c;                                                                 //  variable to get item number to purchase
		Scanner sc = new Scanner(System.in);    
		NormalAcc gsn = new GSNormalAcc(200000,"z",0,false);                   //  created object to access bookProduct()
		
		String[] items = {"Mobile","Laptop","watch","shirt","T-shirt"}; 	   //  String array to keep items in application
		int charges[]= {10000, 50000, 2000, 800, 400};                         //  integer array to keep prices for items in application
		
//		user interaction for product purchase starts
		
		System.out.println("Enter product number(1-5):-");
		c=sc.nextInt();														   //  taking input from user which item to purchase
		switch(c)
			{
			case 1:{
				System.out.println(items[0] + " " + charges[0] + "rs");
				gsn.bookProduct(c);
				break;
			}
			case 2:{
				System.out.println(items[1] + " " + charges[1] + "rs" );
				gsn.bookProduct(c);
				break;
			}
			case 3:{
				System.out.println(items[2] + " " + charges[2] + "rs" );
				gsn.bookProduct(c);
				break;
			}
			case 4:{
				System.out.println(items[3] + " " + charges[3] + "rs" );
				gsn.bookProduct(c);
				break;
			}
			case 5:{
				System.out.println(items[4] + " " + charges[4] + "rs" );
				gsn.bookProduct(c);
				break;
			}
		}	
		return charges[c-1];             // return the price of product selected by user from charges[]
	}

	@Override
	public String toString() {
		return "Continue your Shopping " + accNm+ ".\n";
	}
	
//	*** Entry point for Project ***
//	   User interaction starts here 
	
	public static void main(String[] args) 
	{
			
			ShopFactory gsf=new  GSShopFactory();                          //object of GSshopFactory with reference of ShopFactory
			PrimeAcc gsp = new GSPrimeAcc(100000,"z",500,true);	           //object of GSPrimeAcc with reference of PrimeAcc
			NormalAcc gsn = new GSNormalAcc(200000,"z",0,false);           //object of GSNormal with reference of NormalAcc
			
			int a,b,c;                        //  a,b,c integer variable for handling the loop control & 
			int total;                        //  total for returning addition of product price and delivery charges
			String x;                         //  String variable for accepting user name and passing in object
			Scanner sc =new Scanner(System.in);
			boolean err1 = true, err2 = true, err3 =true;
			
			while(err1 ==true) 
			{
				System.out.println("Do you have an account?*(please enter 1/2)\n 1.Yes\n 2.No");           //  ***logic for users having account ***
				a=sc.nextInt();
				
				if(a==1) 
				{	
					System.out.println("\nEnter your name");
					x=sc.next();                                                                           //  Taking input name
					
					while (err2 == true ) {
					System.out.println("\nAccount Type\n1.Prime \n2.Normal");
					c=sc.nextInt();                                                                        //  Taking input for account type is prime or not		
					
					if(c==1)                                                                               //  **Prime Account**
					{	
						PrimeAcc gsp1 = new GSPrimeAcc(1,x,500,true);
						System.out.println(gsp1.toString());
						gsp1.items(0);
						total=gsp1.order();
						System.out.println("Total amount to pay " + (total + gsp1.deliveryCharges) + "rs"); //  return Total amount to be paid
						err2 = false;
					}else if(c==2)                                                                          //  **Normal Account**
					{	
						NormalAcc gsn1 = new GSNormalAcc(2,"xyz",0,false);
						System.out.println(gsn1.toString());
						gsn1.items(0);
						total=gsn1.order();
						System.out.println("Total amount to pay " + (total + gsn1.deliveryCharges) + "rs"); //  return Total amount to be paid
						err2 = false;
					}else                                                                                  //  for invalid input by user
					{	
						System.out.println("Please select valid input");
					}
					err1=false;
				}	
				}else if(a==2)                                                                            //  ***logic for users not having account*** 
				{	
					System.out.println("\nEnter your name");                      
					x=sc.next();                                                                           //  taking user name as input
					while(err2==true) {
					System.out.println("\nDo you want Prime Membership?*(please enter 1/2)\n 1.Yes\n 2.No");  
					b=sc.nextInt();	                                                                       //  taking choice to create account
					
					if(b==1)                                                                               //  **creating prime Account**
					{	
						while(err3==true) 
						{
							System.out.println("\nPay 500rs for Prime Account");
							System.out.println("Enter Amount:- ");
							c=sc.nextInt();                                                                   //  taking payment
							
							if(c==500)                                                                        //  task to perform if correct amount is paid
							{	
								gsf.getNewPrimeAccount(1,x, 500, true);
								gsp.items(0);
								total=gsp.order();
								System.out.println("Total amount to pay " + (total + gsp.deliveryCharges) + "rs");  //  return Total amount to be paid
								err3=false;
								err2=false;
							}else if(c<500)                                                                    //  task to perform if less amount is entered
							{	
								System.out.println("\n** Please pay required amount **");                              //  alert to pay required amount
							}else if(c>500)                                                                    //  task to perform if extra amount is paid
							{	
								System.out.println("Here is your change: " + (c-500) + "rs");
								gsf.getNewPrimeAccount(1,x, 500, true);
								gsp.items(0);
								total=gsp.order();
								System.out.println("Total amount to pay " + (total + gsp.deliveryCharges) + "rs");  //  return Total amount to be paid
								err3=false;
								err2=false;
							}
						}
					}else if(b==2)                                                                             //  **creating normal account**
					{	
						gsf.getNewNormalAccount(1,x, 0, false);
						gsn.items(0);
						total=gsn.order();
						System.out.println("Total amount to pay " + (total + gsn.deliveryCharges) + "rs");     //  return Total amount to be paid
						err2=false;
					}else 
					{
						System.out.println("\nEnter valid input");                                           //  for invalid input by user for creating account
					}
					err1 = false;
					}				
				}else 
				{
					System.out.println("\nEnter valid input");                                               //  for invalid input by user of 1st if else
				}
			}		
	}
	
}
