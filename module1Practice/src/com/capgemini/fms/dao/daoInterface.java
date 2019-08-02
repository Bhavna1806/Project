package com.capgemini.fms.dao;

import java.util.Map;

import com.capgemini.fms.Excep.ExceptionClass;


public interface daoInterface {

	public Map<String, Integer> addFeedbackDetails(String name, int rating, String topic) throws ExceptionClass;

	public Map<String, Integer> getFeedbackReport() throws ExceptionClass;

}
