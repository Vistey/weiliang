package com.liangjing.www.controller;

import com.liangjing.www.model.Commodity_type;
import com.liangjing.www.service.CommodityService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * 商品类型模块处理
 */
@Controller
@RequestMapping("commodity")
public class CommodityController {

  @Resource
  private CommodityService commodityService;

  /**
   * 获取所有商品数据
   *
   * @return {@link Commodity_type} 所有商品种类列表 state属性 1：有效 ， 0：注销
   */
  @RequestMapping("/allcommodity.do")
  @ResponseBody
  public List<Commodity_type> allCommodity() {
    return commodityService.allCommodity();
  }

  /**
   * 增加商品
   *
   * @param type 商品类型的所有属性{@link Commodity_type}
   * @return {@link Boolean}添加是否成功的返回
   */
  @RequestMapping("/addcommodity.do")
  @ResponseBody
  public boolean addCommodity(Commodity_type type) {
    return commodityService.addCommodity(type);
  }

  // todo @RequestMapping("/updatecommodity.do") 商品内容修改


}
