package com.test01.mapper;

import java.util.List;
import java.util.Map;

import com.test01.entity.Teachers;

public interface TeachersMapper {
    int deleteByPrimaryKey(Map<String,Object> params);

    int insert(Teachers record);

    int insertSelective(Teachers record);

    Teachers selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Teachers record);

    int updateByPrimaryKey(Teachers record);
    public List<Teachers> findTeachesAll(Map<String,Object> params);
}