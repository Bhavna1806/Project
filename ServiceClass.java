
package com.capgemini.test.service;

import com.capgemini.test.bean.Person;
import com.capgemini.test.dao.DaoClass;

public class ServiceClass {

	DaoClass bankDaoObj = new DaoClass();

	public void bankAccountCreate(Person bankBeanObjCreateAccountObj) {
		bankDaoObj.addCustomer(bankBeanObjCreateAccountObj);
	}

	public void showBalanceSer(Person bankbeanShowBalObj) {
		if (bankDaoObj.hm().isEmpty()) {
			System.out.println("Please create an account first.");
		} else {
			if (bankDaoObj.hm().containsKey(bankbeanShowBalObj.getAccNo())) {
				System.out.println(
						"Your Account balance is: " + bankDaoObj.hm().get(bankbeanShowBalObj.getAccNo()).getBalance());
			} else {
				System.out.println("No such Account Exists!");
			}
		}
	}

	public void depositSer(Person bankBeanDepObj) {
		if (bankDaoObj.hm().isEmpty()) {
			System.out.println("Please create an account first!");
		} else {
			if (bankDaoObj.hm().containsKey(bankBeanDepObj.getAccNo())) {
				float dep = bankBeanDepObj.getDepAmount() + bankDaoObj.hm().get(bankBeanDepObj.getAccNo()).getBalance();
				bankDaoObj.hm().get(bankBeanDepObj.getAccNo()).setBalance(dep);
				System.out.println("Deposition successfull.");
				System.out.println(
						"our account balance is: " + bankDaoObj.hm().get(bankBeanDepObj.getAccNo()).getBalance());
			}

			else {
				System.out.println("No such amount exists.");
			}
		}
	}

	public void withdrawSer(Person bankBeanWithdrawObj) {
		if (bankDaoObj.hm().isEmpty()) {
			System.out.println("Please create an account first.");
		} else {
			if (bankBeanWithdrawObj.getWithdrawAmount() > bankDaoObj.hm().get(bankBeanWithdrawObj.getAccNo())
					.getBalance()) {
				System.out.println("Can't withdraw money. Account Balance is low.");
			} else {
				if (bankDaoObj.hm().containsKey(bankBeanWithdrawObj.getAccNo())) {
					float dep = bankDaoObj.hm().get(bankBeanWithdrawObj.getAccNo()).getBalance()
							- bankBeanWithdrawObj.getWithdrawAmount();
					bankDaoObj.hm().get(bankBeanWithdrawObj.getAccNo()).setBalance(dep);
					System.out.println("Withdrawal Successfull.");
					System.out.println("Your account balance is: "
							+ bankDaoObj.hm().get(bankBeanWithdrawObj.getAccNo()).getBalance());
				} else {
					System.out.println("No such account exists.");
				}
			}
		}
	}

	public void transferSer(Person bankBeanFundTransObj) {
		if(bankDaoObj.hm().isEmpty())
		{
			System.out.println("Please create an account first. ");
		}
		else {
			
			if(bankDaoObj.hm().containsKey(bankBeanFundTransObj.getSourceAccNo())) {
		
				if(bankDaoObj.hm().get(bankBeanFundTransObj.getSourceAccNo()).getBalance()>bankBeanFundTransObj.getTransferAmount()) {
					float transfer=bankBeanFundTransObj.getTransferAmount();
					bankDaoObj.hm().get(bankBeanFundTransObj.getSourceAccNo()).setBalance(bankDaoObj.hm().get(bankBeanFundTransObj.getSourceAccNo()).getBalance() - transfer);
					 
					bankDaoObj.hm().get(bankBeanFundTransObj.getDestAccNo()).setBalance(bankDaoObj.hm().get(bankBeanFundTransObj.getDestAccNo()).getBalance() - transfer);
					
					System.out.println("Funds Transfered");
					System.out.println("Remaining balance in account number "+bankBeanFundTransObj.getSourceAccNo()+" is : "+bankDaoObj.hm().get(bankBeanFundTransObj.getSourceAccNo()).getBalance());
					
					
				}
				else
				{
					System.out.println("Can't transfer money. Source account balance is low.");
				}
			}
			else
			{
				System.out.println("Destination Account Do Not Exists.");
			}
		}
		else
		{
			System.out.println("Source account Do Not exists.");
		
		}
	}
}

