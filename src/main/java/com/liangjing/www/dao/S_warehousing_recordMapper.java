package com.liangjing.www.dao;

import com.liangjing.www.model.S_warehousing_record;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface S_warehousing_recordMapper {
  int deleteByPrimaryKey(String batchNumber);

  int insert(S_warehousing_record record);

  int insertSelective(S_warehousing_record record);

  S_warehousing_record selectByPrimaryKey(String batchNumber);

  int updateByPrimaryKeySelective(S_warehousing_record record);

  int updateByPrimaryKey(S_warehousing_record record);

  List<S_warehousing_record> getallWarehousing();

  List<String> getAllBatchNumber();
}