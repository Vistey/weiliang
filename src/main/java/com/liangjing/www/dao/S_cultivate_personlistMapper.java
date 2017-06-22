package com.liangjing.www.dao;

import com.liangjing.www.model.S_cultivate_personlist;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface S_cultivate_personlistMapper {

    List<S_cultivate_personlist> selectAll();

    int deleteByPrimaryKey(Integer cultivateId);

    int insert(S_cultivate_personlist record);

    int insertSelective(S_cultivate_personlist record);

    S_cultivate_personlist selectByPrimaryKey(Integer cultivateId);

    int updateByPrimaryKeySelective(S_cultivate_personlist record);

    int updateByPrimaryKey(S_cultivate_personlist record);
}