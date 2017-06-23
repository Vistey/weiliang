package com.liangjing.www.dao;

import com.liangjing.www.model.R_medical_device_license;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface R_medical_device_licenseMapper {
  int deleteByPrimaryKey(String creditCode);

  int insert(R_medical_device_license record);

  int insertSelective(R_medical_device_license record);

  R_medical_device_license selectByPrimaryKey(String creditCode);

  int updateByPrimaryKeySelective(R_medical_device_license record);

  int updateByPrimaryKey(R_medical_device_license record);

  R_medical_device_license getOurMedicalLicense(String workUnit);

  List<R_medical_device_license> getGmpMedicalLicense(String workUnit);

  List<String> getCertificateExpired();
}