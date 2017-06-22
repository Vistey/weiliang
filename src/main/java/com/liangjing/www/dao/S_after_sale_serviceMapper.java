package com.liangjing.www.dao;

import com.liangjing.www.model.S_after_sale_service;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface S_after_sale_serviceMapper {
  int deleteByPrimaryKey(Integer id);

  int insert(S_after_sale_service record);

  int insertSelective(S_after_sale_service record);

  S_after_sale_service selectByPrimaryKey(Integer id);

  int updateByPrimaryKeySelective(S_after_sale_service record);

  int updateByPrimaryKey(S_after_sale_service record);

  List<S_after_sale_service> getAll();
}