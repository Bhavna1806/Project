package com.capgemini.fms.dao;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.fms.Excep.ApplicationException;

public class FeedbackDAO implements IFeedbackDAO {

	Map<String, Integer> EnglishFeedbackMap = new HashMap<String, Integer>();
	Map<String, Integer> MathFeedbackMap = new HashMap<String, Integer>();
	Map<String, Integer> ConsFeedbackMap = new HashMap<String, Integer>();

	public Map<String, Integer> addFeedbackDetails(String name, int rating, String subject)
			throws ApplicationException {
		if (subject.equals("English")) {
			EnglishFeedbackMap.put(name, rating);
			ConsFeedbackMap = EnglishFeedbackMap;
			System.out.println("English FeedbacK added!");
		} else if (subject.equals("Math")) {
			MathFeedbackMap.put(name, rating);
			ConsFeedbackMap = MathFeedbackMap;
			System.out.println("Math FeedbacK added!");
		}
		return ConsFeedbackMap;
	}

	public Map<String, Integer> getFeedbackReport() throws ApplicationException

	{
		ConsFeedbackMap.putAll(EnglishFeedbackMap);
		ConsFeedbackMap.putAll(MathFeedbackMap);
		return ConsFeedbackMap;
	}
}
