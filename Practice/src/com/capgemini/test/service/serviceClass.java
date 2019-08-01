package com.capgemini.test.service;

import java.awt.List;
import java.util.ArrayList;
import java.util.Map;

import com.capgemini.test.bean.Feedback;
import com.capgemini.test.dao.daoClass;

public class serviceClass {

	daoClass daoObj = new daoClass();

	public boolean addFeedBack(Feedback feedback) {
		if (feedback.getSubject().equalsIgnoreCase("ENGLISH")) {
			daoObj.getEnglishFeedbackMap().put(feedback.getTeacherName(), feedback.getFeedbackPoint());
		}

		if (feedback.getSubject().equalsIgnoreCase("MATH")) {
			daoObj.getMathFeedbackMap().put(feedback.getTeacherName(), feedback.getFeedbackPoint());
		}
		return true;
	}

	public ArrayList<String> showFeedBack() {
		ArrayList<String> feedbackList = new ArrayList<>();

		for (Map.Entry<String, Integer> entry : daoObj.getEnglishFeedbackMap().entrySet())
			feedbackList.add("Teacher name= " + entry.getKey() + "feedback point " + entry.getValue());

		for (Map.Entry<String, Integer> entry : daoObj.getMathFeedbackMap().entrySet())
			feedbackList.add("Teacher name= " + entry.getKey() + "feedback point " + entry.getValue());

		return feedbackList;
	}

}
