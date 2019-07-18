package com.capgemini.fms.service;

import com.capgemini.fms.bean.Feedback;
import com.capgemini.fms.dao.FeedbackDAO;

public abstract class FeedbackService implements IFeedbackService {
	// SERVICE UTILITY CLASS

	IFeedbackDAO dao = new IFeedbackDAO();

	public boolean addFeeBack(String subject, Feedback feedback) {
		if (subject.equalsIgnoreCase("english")) {
			dao.getEnglishFeedbackMap().put(feedback.getTeacherName(), feedback.getFeedBackPoint());
		}

		if (subject.equalsIgnoreCase("math ")) {
			dao.getMathFeedbackMap().put(feedback.getTeacherName(), feedback.getFeedBackPoint());
		}

		return true;
	}
}
