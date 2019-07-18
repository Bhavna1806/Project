package com.capgemini.fms.service;

import java.util.Map;

import com.capgemini.fms.bean.Feedback;

public interface IFeedbackService {

	// SERVICE UTILITY INTERFACE

	String userNamePattern = "[A-Z][a-z]{9}";

	boolean validateteacherName(String teacherName);

	void storeIntoMap(Feedback feedbacks);

	// public abstract
	Map<String, Feedback> displayfeedbacks();

	boolean addFeedback(Feedback feedback);
}
