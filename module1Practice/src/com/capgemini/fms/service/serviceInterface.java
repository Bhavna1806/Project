package com.capgemini.fms.service;

import java.util.Map;

import com.capgemini.fms.Excep.ExceptionClass;

public interface serviceInterface {

	public Map<String, Integer> addFeedbackDetails(String name, int rating, String subject) throws ExceptionClass;

	public Map<String, Integer> getFeedbackReport() throws ExceptionClass;

}
