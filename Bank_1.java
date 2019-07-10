package com.capgemini.test.bean;

public class Bank_1 {
	
	private int i=0;
	private long sourceAccNo, destAccNo;
	private float balance, depAmount, withdrawAmount, transferAmount;
	private String name;
	private long mobNo, accNo;
	public static String transactions[] = new String[5];
	
	//CONSTRUCTOR CALLING
	
	public Bank_1()
	{
		super();
	}
	
	public Bank_1(long accNo, String name, long mobNo, float balance)
	{
		this.accNo=accNo;
		this.name=name;
		this.mobNo=mobNo;
		this.balance=balance;
	}
	
	public Bank_1(long accNo) 
	{
		this.accNo=accNo;
	}
	
	public Bank_1(long accNo, float depAmount)
	{
		this.accNo=accNo;
		this.depAmount=depAmount;
	}
	
	public Bank_1(float withdrawAmount, long accNo)
	{
		this.withdrawAmount=withdrawAmount;
		this.accNo=accNo;
	}
	
	public Bank_1(long sourceAccNo, long destAccNo, float transferAmount) 
	{
		this.sourceAccNo=sourceAccNo;
		this.destAccNo=destAccNo;
		this.transferAmount=transferAmount;
	}
	public Bank_1(String transactions)
	{
		Bank_1.transactions[i]=transactions;
		i++;
	}
	
	//CONSTRUCTORS ENDED
	
		//GETTERS AND SETTERS

	public long getSourceAccNo() {
		return sourceAccNo;
	}

	public void setSourceAccNo(long sourceAccNo) {
		this.sourceAccNo = sourceAccNo;
	}

	public long getDestAccNo() {
		return destAccNo;
	}

	public void setDestAccNo(long destAccNo) {
		this.destAccNo = destAccNo;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public float getDepAmount() {
		return depAmount;
	}

	public void setDepAmount(float depAmount) {
		this.depAmount = depAmount;
	}

	public float getWithdrawAmount() {
		return withdrawAmount;
	}

	public void setWithdrawAmount(float withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}

	public float getTransferAmount() {
		return transferAmount;
	}

	public void setTransferAmount(float transferAmount) {
		this.transferAmount = transferAmount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobNo() {
		return mobNo;
	}

	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	
	
	
	
	
	
	

}















