package com.capgemini.fms.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.capgemini.fms.Excep.ExceptionClass;
import com.capgemini.fms.dao.daoClass;

@TestInstance(Lifecycle.PER_CLASS)
public class DaoTest {
	daoClass dao;
	
	@BeforeAll
	void initializeDao() {
		dao = new daoClass();
		
	}
	@Test
	void addFeddbackTest1() throws ExceptionClass {
		Map<String, Integer>expectedMap = new HashMap<>();
		expectedMap.put("john", 4);
		
		Map<String, Integer>actualMap=dao.addFeedbackDetails("john",4,"Math");
	
		Assert.assertTrue(actualMap.keySet().containsAll(expectedMap.keySet()));
	}
	@Test
	void addFeddbackTest2() throws ExceptionClass {
		Map<String, Integer>expectedMap = new HashMap<>();
		expectedMap.put("john", 4);
		
		Map<String, Integer>actualMap=dao.addFeedbackDetails("john",4,"Math");
	
		Assert.assertEquals(actualMap.size(),expectedMap.size());
	}
@Test
	void getReportTest() throws ExceptionClass{
		dao.addFeedbackDetails("john",4,"Math");
		dao.addFeedbackDetails("john",5,"English");
		Map<String, Integer>actualMap=dao.getFeedbackReport();
		Map<String, Integer>expectedMap = new HashMap<>();
		System.out.println(actualMap.keySet());
		expectedMap.put("john", 5);
		Assert.assertTrue(actualMap.keySet().containsAll(expectedMap.keySet()));
		
	}
}
