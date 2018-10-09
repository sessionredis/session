package com.test01.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test01.entity.Students;
import com.test01.entity.Subjects;
import com.test01.mapper.StudentsMapper;
import com.test01.mapper.SubjectsMapper;
import com.test01.service.SubjectsService;

@Service
public class SubjectsServiceImpl implements SubjectsService{
	private final static Map<String,Object> map = new HashMap<String,Object>();
	@Autowired
	private SubjectsMapper subjectsMapper;
	@Autowired
	private StudentsMapper studentsMapper;
	@Override
	public List<Subjects> selectSubjects(Map<String, Object> params) {
		return subjectsMapper.selectSubjects(params);
	}
	@Override
	public void insertSubjects(Subjects subjects) {
		subjectsMapper.insert(subjects);
	}
	@Override
	public Map<String, Object> delSubjects(Map<String, Object> params) {
		map.clear();
		try{
			List<Students> stuList = studentsMapper.selectStudents(params);
			if(stuList.size()>0){
				map.put("status", "201");
				map.put("message", "请先删除学生！");
				return map;
			}
			subjectsMapper.deleteByPrimaryKey(params);
			map.put("status", "200");
			map.put("message", "删除成功！");
		}catch(Exception e){
			map.put("status", "500");
			map.put("message", "删除失败！");
			e.printStackTrace();
		}
		return map;
	}

}
