package com.liangjing.www.dao;

import com.liangjing.www.model.R_certificate_of_authorization;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface R_certificate_of_authorizationMapper {
  int deleteByPrimaryKey(String companyName);

  int insert(R_certificate_of_authorization record);

  int insertSelective(R_certificate_of_authorization record);

  R_certificate_of_authorization selectByPrimaryKey(String companyName);

  int updateByPrimaryKeySelective(R_certificate_of_authorization record);

  int updateByPrimaryKey(R_certificate_of_authorization record);

  List<R_certificate_of_authorization> getCertificateOfAuthorization();
}