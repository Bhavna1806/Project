package com.capgemini.test.dao;

import java.util.HashMap;

import com.capgemini.test.bean.Person;

public interface DaoInterface {

	HashMap<Long, Person> hm = new HashMap<Long, Person>();

	HashMap<Long, Person> hm();
}
