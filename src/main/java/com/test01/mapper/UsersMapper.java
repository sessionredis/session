package com.test01.mapper;

import java.util.Map;

import com.test01.entity.Users;

public interface UsersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Users record);

    int insertSelective(Users record);

    public Users selectByPrimaryKey(Map<String,Object> map);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
}