package com.liangjing.www.dao;

import com.liangjing.www.model.S_returned_goods;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface S_returned_goodsMapper {
  int deleteByPrimaryKey(Integer id);

  int insert(S_returned_goods record);

  int insertSelective(S_returned_goods record);

  S_returned_goods selectByPrimaryKey(Integer id);

  int updateByPrimaryKeySelective(S_returned_goods record);

  int updateByPrimaryKey(S_returned_goods record);

  List<S_returned_goods> getAll();
}