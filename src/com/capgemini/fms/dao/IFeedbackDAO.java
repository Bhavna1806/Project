package com.capgemini.fms.dao;

import java.util.Map;

import com.capgemini.fms.bean.Feedback;

public interface IFeedbackDAO {

	

	void storeIntoMap(Feedback feedbacks);

	Map<Integer, Feedback> displayfeedbacks();

	Map<String, Integer> addFeedbackDetails(String teacherName, int rating, String topic);

	Map<String, Integer> getFeedbackReport();

}
