package com.test01.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test01.entity.Students;
import com.test01.entity.Teachers;
import com.test01.mapper.StudentsMapper;
import com.test01.mapper.TeachersMapper;
import com.test01.service.TeachersService;

@Service
public class TeachersServiceImpl implements TeachersService {
	private final static Map<String,Object> map = new HashMap<String,Object>();
	@Autowired
	private TeachersMapper teachersMapper;
	@Autowired
	private StudentsMapper studentsMapper;
	@Override
	public void insertTeacher(Teachers teachers) {
		teachersMapper.insert(teachers);
	}
	@Override
	public List<Teachers> findTeacher(Map<String, Object> params) {
		return teachersMapper.findTeachesAll(params);
	}
	@Override
	public Map<String, Object> delTeacher(Map<String, Object> params) {
		map.clear();
		try{
			List<Students> stuList = studentsMapper.selectStudents(params);
			if(stuList.size()>0){
				map.put("status", "201");
				map.put("message", "请先删除学生！");
				return map;
			}
			teachersMapper.deleteByPrimaryKey(params);
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
