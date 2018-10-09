package com.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test01.entity.Teachers;
import com.test01.service.TeachersService;

@RestController
public class TeachersController {

	@Autowired
	private TeachersService tachersService;
	
	@RequestMapping(value="/teacher",method=RequestMethod.POST)
	public void insertTeacher(Teachers teachers){
		tachersService.insertTeacher(teachers);
	}
	
	@RequestMapping(value="/teacher",method=RequestMethod.GET)
	public List<Teachers> findTeacher(@RequestParam Map<String,Object> params){
		return tachersService.findTeacher(params);
	}
	
	@RequestMapping(value="/teacher",method=RequestMethod.DELETE)
	public Map<String,Object> delTeacher(@RequestBody Map<String,Object> params){
		return tachersService.delTeacher(params);
	}
}
