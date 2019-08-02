package com.capgemini.fms.dao;

import java.util.Map;

public interface daoInterface {

	public Map<String, Integer> addFeedbackDetails(String name, int rating, String topic);

	public Map<String, Integer> getFeedbackReport();

}
