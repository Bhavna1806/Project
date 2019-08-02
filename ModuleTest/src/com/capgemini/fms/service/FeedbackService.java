package com.capgemini.fms.service;

import java.util.Map;

import com.capgemini.fms.Excep.ApplicationException;
import com.capgemini.fms.dao.FeedbackDAO;

public class FeedbackService implements IFeedbackService {

	FeedbackDAO dao = new FeedbackDAO();

	public Map<String, Integer> addFeedbackDetails(String name, int rating, String subject)
			throws ApplicationException {
		return dao.addFeedbackDetails(name, rating, subject);
	}

	public Map<String, Integer> getFeedbackReport() throws ApplicationException {
		return dao.getFeedbackReport();
	}

}
