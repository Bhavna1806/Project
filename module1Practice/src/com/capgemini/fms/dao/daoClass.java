package com.capgemini.fms.dao;

import java.util.HashMap;
import java.util.Map;

public class daoClass implements daoInterface {

	Map<String, Integer> EnglishFeedbackMap = new HashMap<String, Integer>();
	Map<String, Integer> MathFeedbackMap = new HashMap<String, Integer>();
	Map<String, Integer> ConsMap = new HashMap<String, Integer>();

	public Map<String, Integer> addFeedbackDetails(String name, int rating, String topic) {
		if (topic.equals("English")) {
			EnglishFeedbackMap.put(name, rating);
			System.out.println("English Feedback Added!");
		} else if (topic.equals("Math")) {
			MathFeedbackMap.put(name, rating);
			System.out.println("Math Feedback Added!");
		}
		return ConsMap;
	}

	@Override
	public Map<String, Integer> getFeedbackReport() {
		// TODO Auto-generated method stub
		return null;
	}

}
