package com.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test01.entity.Students;
import com.test01.service.StudentsService;

@RestController
public class StudentController {

	@Autowired
	private StudentsService studentsService;
	
	@RequestMapping(value="/students",method=RequestMethod.GET)
	public List<Students> selectStudents(@RequestParam Map<String,Object> params){
		return studentsService.selectStudents(params);
	}
	@RequestMapping(value="/students",method=RequestMethod.POST)
	public void insertStudents(Students student){
		studentsService.insertStudents(student);
	}
	@RequestMapping(value="/students",method=RequestMethod.DELETE)
	public Map<String,Object> delStudents(@RequestBody Map<String,Object> params){
		return studentsService.deleteByPrimaryKey(params);
	}
	
	@RequestMapping(value="/students",method=RequestMethod.PATCH)
	public void updateScores(@RequestParam Map<String,Object> params){
		studentsService.updateScores(params);
	}
}
