package com.liangjing.www.dao;

import com.liangjing.www.model.C_contact_lens_manager;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface C_contact_lens_managerMapper {

    List<C_contact_lens_manager> allCLM();

    int deleteByPrimaryKey(String idCard);

    int insert(C_contact_lens_manager record);

    int insertSelective(C_contact_lens_manager record);

    C_contact_lens_manager selectByPrimaryKey(String idCard);

    int updateByPrimaryKeySelective(C_contact_lens_manager record);

    int updateByPrimaryKey(C_contact_lens_manager record);
}