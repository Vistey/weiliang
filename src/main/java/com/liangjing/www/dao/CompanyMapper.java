package com.liangjing.www.dao;

import com.liangjing.www.model.Company;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyMapper {


  int deleteByPrimaryKey(String companyName);

  int insert(Company record);

  int insertSelective(Company record);

  List<String> getListCompanyName();

  int addcompany(String companyName);
}