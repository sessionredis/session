package com.test01.service;

import java.util.List;
import java.util.Map;

import com.test01.entity.Subjects;

public interface SubjectsService {
	public List<Subjects> selectSubjects(Map<String,Object> params);
	public void insertSubjects(Subjects subjects);
	public Map<String,Object> delSubjects(Map<String,Object> params);
}
