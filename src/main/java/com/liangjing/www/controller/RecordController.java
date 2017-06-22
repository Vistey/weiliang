package com.liangjing.www.controller;

import com.liangjing.www.model.*;
import com.liangjing.www.service.RecordService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * 记录表处理模块
 */
@RequestMapping("recordController")
@Controller
public class RecordController {

  @Resource
  private RecordService service;

  /**
   * 获取所有库存记录数据
   *
   * @return {@link S_warehousing_record} 返回所有库存记录
   */
  @ResponseBody
  @RequestMapping("/allWarehousing.do")
  public List<S_warehousing_record> allWarehousing() {
    return service.allWarehousing();
  }

  /**
   * 获取库存中批号
   *
   * @return {@link String}返回所有批号
   */
  @RequestMapping("/getAllWarehousingBatchNumber.do")
  @ResponseBody
  public List<String> getAllWarehousingBatchNumber() {
    return service.getAllWarehousingBatchNumber();
  }

  /**
   * 添加库存记录
   *
   * @param record {@link S_warehousing_record} 库存数据对象
   * @return {@link Boolean} true添加成功 false 添加失败
   */
  @RequestMapping("/addWarehousing.do")
  @ResponseBody
  public boolean addWarehousing(S_warehousing_record record, HttpSession session) {
    record.setPurchaseDate(new Date());
    record.setInspectionDate(new Date());
    record.setInspectionDate(new Date());
    record.setConfirmingPerson((String) session.getAttribute("name"));
    return service.addWarehousing(record);
  }

  /**
   * 获取所有销售记录数据
   *
   * @return {@link S_sales_record} 返回所有销售纪律
   */
  @ResponseBody
  @RequestMapping("/allSales.do")
  public List<S_sales_record> allSales() {
    return service.allSales();
  }


  /**
   * 添加销售记录
   *
   * @param record  {@link S_sales_record} 销售数据
   * @param session 登录操作的用户名
   * @return {@link Boolean} true添加成功 false 添加失败
   */
  @RequestMapping("/addSales.do")
  @ResponseBody
  public boolean addSales(S_sales_record record, HttpSession session) {
    record.setSaleDate(new Date());
    record.setConfirmingPerson((String) session.getAttribute("name"));
    return service.addSales(record);
  }

  /**
   * 获取所有质量跟踪记录
   *
   * @return {@link S_trace_record} 质量跟踪记录
   */
  @RequestMapping("/getTraceRecord.do")
  @ResponseBody
  public List<S_trace_record> getTraceRecord() {
    return service.getTraceRecord();
  }

  /**
   * 增加质量跟踪记录
   *
   * @param record {@link S_trace_record} 质量跟踪记录
   * @return {@link Boolean} true添加成功 false 添加失败
   */
  @RequestMapping("/addTraceRecord.do")
  @ResponseBody
  public boolean addTraceRecord(S_trace_record record) {
    return service.addTraceRecord(record);
  }

  /**
   * 获取所有员工培训计划
   *
   * @return {@link S_cultivate_record} 员工培训记录
   */
  @RequestMapping("/getTrainingPlan.do")
  @ResponseBody
  public List<S_cultivate_record> getTrainingPlan() {
    return service.getTrainingPlan();
  }

  /**
   * 获取所有不合格产品记录
   *
   * @return {@link S_nonconformity_record} 不合格产品记录
   */
  @RequestMapping("/getNonconformity.do")
  @ResponseBody
  public List<S_nonconformity_record> getNonconformity() {
    return service.getNonconformity();
  }

  /**
   * 获取所有顾客退换片记录
   *
   * @return {@link S_returned_goods} 顾客退换片记录
   */
  @RequestMapping("/getReturnedGoods.do")
  @ResponseBody
  public List<S_returned_goods> getReturnedGoods() {
    return service.getReturnedGoods();
  }

  //public List<>

}

