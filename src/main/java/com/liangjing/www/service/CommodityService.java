package com.liangjing.www.service;

import com.liangjing.www.dao.Commodity_typeMapper;
import com.liangjing.www.model.Commodity_type;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 商品处理模块
 */
@Service
public class CommodityService {

  @Resource
  private Commodity_typeMapper typeMapper;

  /**
   * 获取所有商品类型
   *
   * @return 商品类型 state属性 1：有效 ， 0：注销
   */
  public List<Commodity_type> allCommodity() {
    return typeMapper.selectAllCommodity();
  }

  /**
   * 增加一个商品
   *
   * @param type {@link Commodity_type} 传入需要增加的对象
   * @return 是否添加成功
   */
  public boolean addCommodity(Commodity_type type) {
    return typeMapper.insertSelective(type) == 1;
  }



}
