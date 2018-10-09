package com.test01.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.test01.entity.Person01;
import com.test01.mapper.Person01Mapper;
import com.test01.service.PersonService01;

@Service
public class PersonService01Impl implements PersonService01{
	private static final Logger log = LoggerFactory.getLogger(PersonService01.class);
	private final static Map<String,Object> map = new HashMap<String,Object>();
	@Autowired
	private Person01Mapper person01Mapper;
//	@Autowired
//    private StringRedisTemplate stringRedisTemplate;
//	@Autowired
//    RedisTemplate<Object, Object> redisTemplate;
//
//    @Resource(name = "redisTemplate")
//    ValueOperations<Object, Object> valOps;
    
    @Cacheable({"name","age"})
	@Override
	public List<Person01> findMap() {
		List<Person01> personList = person01Mapper.queryPerson();
		return personList;
	}
    @CachePut(value="user")
	@Override
	public Map<String, Object> insert() {
		map.clear();
		log.info("map清空值...");
		try{
			Person01 person01 = new Person01();
			person01.setAddress("唐山市曹妃甸区");
			person01.setAge(23);
			person01.setName("傻磊");
			person01.setSex(1);
			person01Mapper.insert(person01);
			map.put("status", 200);
			map.put("message", "添加成功");
		}catch(Exception e){
			e.getMessage();
			map.put("status", 500);
			map.put("message", "添加失败");
		}
		
		return map;
	}
	@CacheEvict(value={"name","age"},allEntries=true)
	@Override
	public void deleteByPrimaryKey(int id) {
		person01Mapper.deleteByPrimaryKey(id);
	}

}
