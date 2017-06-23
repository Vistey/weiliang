package com.liangjing.www.dao;

import com.liangjing.www.model.Staff;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StaffMapper {

  int userLogin(Staff record);

  int deleteByPrimaryKey(String idCard);

  int insert(Staff record);

  int insertSelective(Staff record);

  Staff selectByPrimaryKey(String idCard);

  int updateByPrimaryKeySelective(Staff record);

  int updateByPrimaryKey(Staff record);

  String getWorkUnit(Staff staff);

  String getName(String idCard);

  List<Staff> allStaff();
}