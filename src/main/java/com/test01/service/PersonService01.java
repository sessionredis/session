package com.test01.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.test01.entity.Person01;

public interface PersonService01 {
	public List<Person01> findMap();
	public Map<String,Object> insert();
	void deleteByPrimaryKey(int id);
}
