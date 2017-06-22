package com.liangjing.www.dao;

import com.liangjing.www.model.S_sales_record;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface S_sales_recordMapper {
  int deleteByPrimaryKey(Integer id);

  int insert(S_sales_record record);

  int insertSelective(S_sales_record record);

  S_sales_record selectByPrimaryKey(Integer id);

  int updateByPrimaryKeySelective(S_sales_record record);

  int updateByPrimaryKey(S_sales_record record);

  List<S_sales_record> getallSales();

}