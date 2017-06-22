package com.liangjing.www.dao;

import com.liangjing.www.model.S_complaint_record;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface S_complaint_recordMapper {
  int deleteByPrimaryKey(Integer id);

  int insert(S_complaint_record record);

  int insertSelective(S_complaint_record record);

  S_complaint_record selectByPrimaryKey(Integer id);

  int updateByPrimaryKeySelective(S_complaint_record record);

  int updateByPrimaryKey(S_complaint_record record);

  List<S_complaint_record> getAll();
}