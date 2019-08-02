package com.capgemini.fms.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.capgemini.fms.Excep.ExceptionClass;


public class daoClass implements daoInterface {

	Map<String, Integer> EnglishFeedbackMap = new HashMap<String, Integer>();
	Map<String, Integer> MathFeedbackMap = new HashMap<String, Integer>();
	Map<String, Integer> ConsMap = new HashMap<String, Integer>();

	public Map<String, Integer> addFeedbackDetails(String name, int rating, String topic) throws ExceptionClass {
		if (topic.equals("English")) {
			EnglishFeedbackMap.put(name, rating);
			ConsMap=EnglishFeedbackMap;
			System.out.println("English Feedback Added!");
		} else if (topic.equals("Math")) {
			MathFeedbackMap.put(name, rating);
			ConsMap=MathFeedbackMap;
			System.out.println("Math Feedback Added!");
		}
		System.out.println("Maths : "+MathFeedbackMap.keySet());
		System.out.println("English : "+EnglishFeedbackMap.keySet());
		return ConsMap;
	}

	@Override
	public Map<String, Integer> getFeedbackReport() throws ExceptionClass {
		
		// TODO Auto-generated method stub
		ConsMap=new HashMap<>();
		Set<String> englishKeys=EnglishFeedbackMap.keySet();
		Set<String> mathKeys=MathFeedbackMap.keySet();
		//ConsMap.putAll(EnglishFeedbackMap);
		//ConsMap.putAll(MathFeedbackMap);
		
		System.out.println("english keys "+englishKeys);
		for (String etname:englishKeys) {
			for(String mtname:mathKeys) {
				if(etname.equals(mtname)) {
					if(EnglishFeedbackMap.get(etname)>MathFeedbackMap.get(mtname)) {
						ConsMap.put(etname, EnglishFeedbackMap.get(etname));;
					}
					else {ConsMap.put(etname, MathFeedbackMap.get(etname));}
							
			}else {
				
			}
			}
			
		}
		
		return ConsMap;
	}

}
