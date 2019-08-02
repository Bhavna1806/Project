package com.capgemini.fms.service;

import java.util.Map;

import com.capgemini.fms.Excep.ExceptionClass;
import com.capgemini.fms.dao.daoClass;

public class serviceClass implements serviceInterface {
	daoClass dao=new daoClass();

	public Map<String, Integer> addFeedbackDetails(String name, int rating, String subject) throws ExceptionClass {
		return dao.addFeedbackDetails(name, rating, subject);
	}

	public Map<String, Integer> getFeedbackReport() throws ExceptionClass {
		return dao.getFeedbackReport();
	}

}
