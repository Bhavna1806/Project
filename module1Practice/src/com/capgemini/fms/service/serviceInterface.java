package com.capgemini.fms.service;

import java.util.Map;

public interface serviceInterface {

	public Map<String, Integer> addFeedbackDetails(String name, int rating, String subject);

	public Map<String, Integer> getFeedbackReport();

}
