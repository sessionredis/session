package com.test01.service;

import java.util.List;
import java.util.Map;

import com.test01.entity.Teachers;

public interface TeachersService {

	public void insertTeacher(Teachers teachers);
	public List<Teachers> findTeacher(Map<String,Object> params);
	public Map<String,Object> delTeacher(Map<String,Object> params);
}
