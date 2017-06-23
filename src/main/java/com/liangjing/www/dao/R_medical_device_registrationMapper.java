package com.liangjing.www.dao;

import com.liangjing.www.model.R_medical_device_registration;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface R_medical_device_registrationMapper {
  int deleteByPrimaryKey(String creditCode);

  int insert(R_medical_device_registration record);

  int insertSelective(R_medical_device_registration record);

  R_medical_device_registration selectByPrimaryKey(String creditCode);

  int updateByPrimaryKeySelective(R_medical_device_registration record);

  int updateByPrimaryKey(R_medical_device_registration record);

  List<R_medical_device_registration> getMedicalDeviceRegistration();

  List<String> getCertificateExpired();
}