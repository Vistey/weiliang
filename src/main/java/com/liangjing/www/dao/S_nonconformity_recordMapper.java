package com.liangjing.www.dao;

import com.liangjing.www.model.S_nonconformity_record;

public interface S_nonconformity_recordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(S_nonconformity_record record);

    int insertSelective(S_nonconformity_record record);

    S_nonconformity_record selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(S_nonconformity_record record);

    int updateByPrimaryKey(S_nonconformity_record record);
}