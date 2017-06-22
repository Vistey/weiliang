package com.liangjing.www.dao;

import com.liangjing.www.model.S_trace_record;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface S_trace_recordMapper {
  int deleteByPrimaryKey(Integer id);

  int insert(S_trace_record record);

  int insertSelective(S_trace_record record);

  S_trace_record selectByPrimaryKey(Integer id);

  int updateByPrimaryKeySelective(S_trace_record record);

  int updateByPrimaryKey(S_trace_record record);

  List<S_trace_record> getAll();
}