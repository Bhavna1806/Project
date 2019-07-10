package com.capgemini.test.ui;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

import com.capgemini.test.bean.Bank_1;
import com.capgemini.test.service.Service;

//import bank

public class Modules 
{
		Service serviceObj=new Service();
		Scanner sc=new Scanner(System.in);
		
		//BANK MAIN METHOD
		
		public void createAccount()
		{
			System.out.println("Enter the Name: ");
			String name=nameCheck(sc.next());
			System.out.println("Enter the phone number: ");
			long phno=mobCheck(sc.nextLong());
			long accNo=phno-1234;
			System.out.println("Enter the Balance: ");
			float balance = amountCheck(sc.nextFloat());
			Bank_1 bankBeanObjCreateAccountObj = new Bank_1(accNo, name, phno, balance);
			
			System.out.println("ACCOUNT CREATED WITH ACCOUNT NUMBER: "+accNo);
			
			serviceObj.bankAccountCreate(bankBeanObjCreateAccountObj);
			
			}
		
		public void showBalance() {
			System.out.println("Enter the Account Number: ");
					long accNo = sc.nextLong();
					Bank_1 bankBeanShowBalObj = new Bank_1(accNo);
					serviceObj.showBalanceSer(bankBeanShowBalObj);
					
		}
		public void deposit()
		{
			System.out.println("Enter the Account Number: ");
			long accNo=sc.nextLong();
			System.out.println("Enter the Deposit Amount: ");
			float depAmount = amountCheck(sc.nextFloat());
			 Bank_1 bankBeanDeptObj = new Bank_1(accNo, depAmount);
			serviceObj.depositSer(bankBeanDeptObj);

		}
		
		public void withdraw() {
			System.out.println("Enter Account Number: ");
			long accNo=sc.nextLong();
			System.out.println("Enter the Withdraw Amount: ");
			float withdrawAmount = amountCheck(sc.nextFloat());
			Bank_1 bankBeanWithdrawObj = new Bank_1(withdrawAmount , accNo);
			serviceObj.withdrawSer(bankBeanWithdrawObj);
			
		}
		
		public void fundTransfer()
		{
			System.out.println("Enter source account number: ");
			long sourceAccNo = sc.nextLong();
			System.out.println("Enter the destination account number: ");
			long destAccNo=sc.nextLong();
			System.out.println("Enter the amount to be transfer: ");
			float transferAmount=amountCheck(sc.nextFloat());
			Bank_1 bankBeanFundTransObj=new Bank_1(sourceAccNo, destAccNo, transferAmount);
			serviceObj.transferSer(bankBeanFundTransObj);
			String transactions= transferAmount+ " transferred from Account number "+sourceAccNo+" to "+destAccNo;
			bankBeanFundTransObj= new Bank_1(transactions);
		}
		
		public void printTransactions() {
			System.out.println(Arrays.toString(Bank_1.transactions));
		}
		
		
		//CHECKER METHODS
		
		//METHOD TO CHECK IF THE AMOUNT IS SMALLER THAN 0R NOT
		
		public float amountCheck(float amount)
		{
			while(true) {
				if(amount<=0) {
					System.out.println("Amount should be greater than 0");
					System.out.println("Enter again: ");
					amount=sc.nextInt();
				}
				else
				{
					return amount;
				}
			}
		}
		
		//METHOD TO CHECK THE NAME:
		
		public String nameCheck(String name)
		{
			while(true) {
				if(Pattern.matches("([A-Z])*([a-z])*", name)) {
					return name;
				}
				
				else {
					System.out.println("Name should only have alphabets");
					System.out.println("Enter again: ");
					name=sc.next();
				}
			}
		}
		
		// METHOD TO CHECK THE LENGTH OF PHONE NUMBER
		
		public long mobCheck(long mob) {
			while(true) {
				if(String.valueOf(mob).length()<10) {
					System.out.println("Enter the valid mobile number: ");
					mob=sc.nextLong();
				}
				else {
					return mob;
				}
			}
		}
}























