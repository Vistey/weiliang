package com.liangjing.www.dao;

import com.liangjing.www.model.Commodity_type;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Commodity_typeMapper {
    int deleteByPrimaryKey(String type);

    int insert(Commodity_type record);

    int insertSelective(Commodity_type record);

    Commodity_type selectByPrimaryKey(String type);

    int updateByPrimaryKeySelective(Commodity_type record);

    int updateByPrimaryKey(Commodity_type record);

    List<Commodity_type> selectAllCommodity();



}