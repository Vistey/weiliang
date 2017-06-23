package com.liangjing.www.dao;

import com.liangjing.www.model.S_cultivate_record;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface S_cultivate_recordMapper {
  int deleteByPrimaryKey(Integer id);

  int insert(S_cultivate_record record);

  int insertSelective(S_cultivate_record record);

  S_cultivate_record selectByPrimaryKey(Integer id);

  int updateByPrimaryKeySelective(S_cultivate_record record);

  int updateByPrimaryKey(S_cultivate_record record);

  List<S_cultivate_record> getAll();

  int insertSelectiveBackId(S_cultivate_record cultivateRecord);
}