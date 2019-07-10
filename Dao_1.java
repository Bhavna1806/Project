package com.capgemini.test.dao;
import java.util.HashMap;

import com.capgemini.test.bean.Bank_1;

//import

public class Dao_1 
{
	Bank_1 beankBeanObj;
	HashMap<Long, Bank_1> hm=new HashMap<Long, Bank_1>();
	
	public void addCustomer(Bank_1 beankBankObj) {
	}
	{
		this.beankBeanObj=beankBeanObj;
		hm.put(beankBeanObj.getAccNo(), beankBeanObj);
	}
	
	public HashMap<Long, Bank_1> hm()
	{
		return hm;
	}
	
}
