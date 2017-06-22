package com.liangjing.www.dao;

import com.liangjing.www.model.C_optometrist;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface C_optometristMapper {
  int deleteByPrimaryKey(String idCard);

  int insert(C_optometrist record);

  int insertSelective(C_optometrist record);

  C_optometrist selectByPrimaryKey(String idCard);

  int updateByPrimaryKeySelective(C_optometrist record);

  int updateByPrimaryKey(C_optometrist record);

  List<C_optometrist> allOptometrist();
}