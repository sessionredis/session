package com.test02.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test02.entity.Person02;
import com.test02.mapper.EmployeeMapper;
import com.test02.mapper.Person02Mapper;
import com.test02.service.PersonService02;

@Service
public class PersonService02Impl implements PersonService02{

	private final static Map<String,Object> map = new HashMap<String,Object>();
	@Autowired
	private Person02Mapper person02Mapper;
	@Autowired
	private EmployeeMapper employeeMapper;
	@Override
	public Map<String, Object> findMap() {
		// TODO Auto-generated method stub
		map.clear();
		map.put("person", person02Mapper.queryPerson());
		map.put("employee", employeeMapper.findEmployee());
		return map;
	}
	@Override
	public Map<String,Object> insert(){
		map.clear();
		try{
			Person02 person02 = new Person02();
			person02.setAddress("唐山市曹妃甸区蓝海");
			person02.setAge(24);
			person02.setName("傻磊2");
			person02.setSex(2);
			person02Mapper.insert(person02);
			map.put("status", 200);
			map.put("message", "添加成功");
		}catch(Exception e){
			e.getMessage();
			map.put("status", 500);
			map.put("message", "添加失败");
		}
		
		return map;
	}

}
