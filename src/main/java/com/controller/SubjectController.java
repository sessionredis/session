package com.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test01.entity.Subjects;
import com.test01.service.SubjectsService;

@RestController
public class SubjectController {

	@Autowired
	private SubjectsService subjectsService;
	
	@RequestMapping(value="/subjects",method=RequestMethod.GET)
	public List<Subjects> selectSubjects(@RequestParam Map<String,Object> params){
		return subjectsService.selectSubjects(params);
	}
	@RequestMapping(value="/subjects",method=RequestMethod.POST)
	public void insertSubjects(Subjects subjects){
		subjectsService.insertSubjects(subjects);
	}
	@RequestMapping(value="/subjects",method=RequestMethod.DELETE)
	public Map<String,Object> delSubjects(@RequestParam Map<String,Object> params){
		return subjectsService.delSubjects(params);
	}
}
