package com.test01.mapper;

import java.util.List;
import java.util.Map;

import com.test01.entity.Students;

public interface StudentsMapper {
    int deleteByPrimaryKey(Map<String,Object> params);

    int insert(Students record);

    int insertSelective(Students record);

    Students selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Students record);

    int updateByPrimaryKey(Students record);
    public List<Students> selectStudents(Map<String, Object> params);
    
    public List<Students> calculationScores(Map<String,Object> params);
    public void updateScores(Students record);
}