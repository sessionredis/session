package com.test01.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.test01.entity.Person01;

public interface Person01Mapper {
    void deleteByPrimaryKey(int id);

    int insert(Person01 record);

    int insertSelective(Person01 record);

    Person01 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Person01 record);

    int updateByPrimaryKey(Person01 record);
    
    List<Person01> queryPerson();
}