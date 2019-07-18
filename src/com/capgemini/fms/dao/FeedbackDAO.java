package com.capgemini.fms.dao;

import java.util.HashMap;

//CLASS TO PERFORM DATA ACCESSING LOGIC.

public abstract class FeedbackDAO implements IFeedbackDAO {

	private HashMap<String, Integer> englishFeedbackMap = new HashMap<>();
	private HashMap<String, Integer> mathFeedbackMap = new HashMap<>();

	public HashMap<String, Integer> getEnglishFeedbackMap() {
		return englishFeedbackMap;
	}

	public void setEnglishFeedbackMap(HashMap<String, Integer> englishFeedbackMap) {
		this.englishFeedbackMap = englishFeedbackMap;
	}

	public HashMap<String, Integer> getMathFeedbackMap() {
		return mathFeedbackMap;
	}

	public void setMathFeedbackMap(HashMap<String, Integer> mathFeedbackMap) {
		this.mathFeedbackMap = mathFeedbackMap;
	}

}
