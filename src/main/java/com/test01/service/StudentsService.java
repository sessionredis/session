package com.test01.service;

import java.util.List;
import java.util.Map;

import com.test01.entity.Students;

public interface StudentsService {

	public List<Students> selectStudents(Map<String,Object> params);
	public void insertStudents(Students student);
	public Map<String,Object> deleteByPrimaryKey(Map<String,Object> params);
	public void updateScores(Map<String,Object> params);
}
