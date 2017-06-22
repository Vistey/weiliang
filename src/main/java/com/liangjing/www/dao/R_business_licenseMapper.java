package com.liangjing.www.dao;

import com.liangjing.www.model.R_business_license;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface R_business_licenseMapper {
  int deleteByPrimaryKey(String creditCode);

  int insert(R_business_license record);

  int insertSelective(R_business_license record);

  R_business_license selectByPrimaryKey(String creditCode);

  int updateByPrimaryKeySelective(R_business_license record);

  int updateByPrimaryKey(R_business_license record);

  R_business_license getOurBusinessLicense(String workUnit);

  List<R_business_license> getGmpBusinessLicense(String workUnit);

}