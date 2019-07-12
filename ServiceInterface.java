package com.capgemini.test.service;

import com.capgemini.test.bean.Person;

public interface ServiceInterface {

	void bankAccountCreate(Person bankBeanObjCreateAccountObj);

	void showBalanceSer(Person bankbeanShowBalObj);

	void depositSer(Person bankBeanDepObj);

	void withdrawSer(Person bankBeanWithdrawObj);

	void transferSer(Person bankBeanFundTransObj);
}
