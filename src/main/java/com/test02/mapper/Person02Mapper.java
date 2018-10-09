package com.test02.mapper;

import java.util.List;

import com.test02.entity.Person02;

public interface Person02Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Person02 record);

    int insertSelective(Person02 record);

    Person02 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Person02 record);

    int updateByPrimaryKey(Person02 record);
    
    List<Person02> queryPerson();
}