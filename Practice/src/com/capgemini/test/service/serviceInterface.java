package com.capgemini.test.service;

import java.util.Map;

import com.capgemini.test.bean.Feedback;

public interface serviceInterface {

	String userNamePattern = "[A-Z][a-z]{9}";

	boolean validateUserName(String userName);

	void storeIntoMap(Feedback feedback);

	// public abstract
	Map<String, Integer> showFeedBack();
}
