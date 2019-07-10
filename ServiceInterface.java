package com.capgemini.test.service;

import Work1.Bank_1;

public interface ServiceInterface {
	 void bankAccountCreate(Bank_1 bankBeanObjCreateAccountObj);
	 void showBalanceSer(Bank_1 bankbeanShowBalObj);
	 void depositSer(Bank_1 bankBeanDepObj);
	 void withdrawSer(Bank_1 bankBeanWithdrawObj);
	 void transferSer(Bank_1 bankBeanFundTransObj);
}
