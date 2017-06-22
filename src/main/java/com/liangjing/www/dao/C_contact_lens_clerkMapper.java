package com.liangjing.www.dao;

import com.liangjing.www.model.C_contact_lens_clerk;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface C_contact_lens_clerkMapper {

    List<C_contact_lens_clerk> allCLC();

    int deleteByPrimaryKey(String idCard);

    int insert(C_contact_lens_clerk record);

    int insertSelective(C_contact_lens_clerk record);

    C_contact_lens_clerk selectByPrimaryKey(String idCard);

    int updateByPrimaryKeySelective(C_contact_lens_clerk record);

    int updateByPrimaryKey(C_contact_lens_clerk record);
}