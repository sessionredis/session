package com.test01.mapper;

import java.util.List;
import java.util.Map;

import com.test01.entity.Subjects;

public interface SubjectsMapper {
    int deleteByPrimaryKey(Map<String,Object> params);

    int insert(Subjects record);

    int insertSelective(Subjects record);

    Subjects selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Subjects record);

    int updateByPrimaryKey(Subjects record);
    
    public List<Subjects> selectSubjects(Map<String,Object> params);
}