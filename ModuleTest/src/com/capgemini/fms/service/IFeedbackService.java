package com.capgemini.fms.service;

import java.util.Map;

import com.capgemini.fms.Excep.ApplicationException;

public interface IFeedbackService {

	public Map<String, Integer> addFeedbackDetails(String name, int rating, String subject) throws ApplicationException;

	public Map<String, Integer> getFeedbackReport() throws ApplicationException;

}
