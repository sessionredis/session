package com.test01.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test01.entity.Students;
import com.test01.mapper.StudentsMapper;
import com.test01.service.StudentsService;

@Service
public class StudentsServiceImpl implements StudentsService{
	private final static Map<String,Object> map = new HashMap<String,Object>();

	@Autowired
	private StudentsMapper studentsMapper;
	@Override
	public List<Students> selectStudents(Map<String, Object> params) {
		return studentsMapper.selectStudents(params);
	}

	@Override
	public void insertStudents(Students student) {
		studentsMapper.insert(student);
	}

	@Override
	public Map<String, Object> deleteByPrimaryKey(Map<String, Object> params) {
		map.clear();
		try{
			studentsMapper.deleteByPrimaryKey(params);
			map.put("status", "200");
			map.put("message", "删除成功！");
		}catch(Exception e){
			map.put("status", "500");
			map.put("message", "删除失败！"+e.getMessage());
			e.printStackTrace();
		}
		return map;
	}

	@Override
	public void updateScores(Map<String,Object> params) {
		List<Students> stuList = studentsMapper.calculationScores(params);
		for (Students students : stuList) {
			studentsMapper.updateScores(students);
		}
	}

}
