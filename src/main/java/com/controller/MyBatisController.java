package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test01.entity.Person01;
import com.test01.service.PersonService01;
import com.test02.service.PersonService02;

@RestController
public class MyBatisController {

	@Autowired
	private PersonService01 personService01;
	@Autowired
	private PersonService02 personService02;
	
	@RequestMapping("/test01")
	public List<Person01> test01(@RequestParam Map<String, Object> params){
		System.err.println("=========="+params);
		List<Person01> person01 = personService01.findMap();
		return person01;
	}
	@RequestMapping("/test01Insert")
	public Map<String,Object> test01Insert(){
		System.err.println("==========");
		Map<String,Object> map = personService01.insert();
		return map;
	}
	@RequestMapping("/deleteTest")
	public void deleteTest(@RequestParam Map<String, Object> params){
		int id = Integer.parseInt(String.valueOf(params.get("id")));
		personService01.deleteByPrimaryKey(id);
	}
	
	
	@RequestMapping("/test02")
	public Map<String,Object> test02(){
		Map<String,Object> map = personService02.findMap();
		return map;
	}
	@RequestMapping("/test02Insert")
	public Map<String,Object> test02Insert(){
		Map<String,Object> map = personService02.insert();
		return map;
	}
}
