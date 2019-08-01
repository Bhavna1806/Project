package com.capgemini.test.dao;

import java.util.HashMap;
import java.util.Map;

public class daoClass implements daoInterface {

	private Map<String, Integer> englishFeedbackMap = new HashMap<String, Integer>();
	private Map<String, Integer> mathFeedbackMap = new HashMap<String, Integer>();

	public Map<String, Integer> getEnglishFeedbackMap() {
		return englishFeedbackMap;
	}

	public void setEnglishFeedbackMap(HashMap<String, Integer> englishFeedbackMap)
	{
		this.englishFeedbackMap=getEnglishFeedbackMap();
	}

	public Map<String, Integer> getMathFeedbackMap() {
		return mathFeedbackMap;
	}

	public void setMathFeedbackMap(HashMap<String, Integer> mathFeedbackMap)
	{
		this.mathFeedbackMap=getEnglishFeedbackMap();
	}

}
