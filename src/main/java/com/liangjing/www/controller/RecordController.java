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
    record.setAddTime(new Date());
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
   * 增加员工培训计划
   *
   * @param cultivateRecord {@link S_cultivate_record} 员工培训记录
   * @return {@link Boolean} true添加成功 false 添加失败
   */
  @RequestMapping("/addTrainingPlan.do")
  @ResponseBody
  public boolean addTrainingPlan(S_cultivate_record cultivateRecord) {
    return service.addTrainingPlan(cultivateRecord);
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
   * 增加不合格产品记录
   *
   * @param record {@link S_nonconformity_record} 不合格产品记录
   * @return {@link Boolean} true添加成功 false 添加失败
   */
  @RequestMapping("/addNonconformity.do")
  @ResponseBody
  public boolean addNonconformity(S_nonconformity_record record){
    return service.addNonconformity(record);
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

  /**
   * 增加顾客退换片记录
   *
   * @param goods {@link S_returned_goods} 顾客退换片记录
   * @return {@link Boolean} true添加成功 false 添加失败
   */
  @RequestMapping("/addReturnedGoods.do")
  @ResponseBody
  public boolean addReturnedGoods(S_returned_goods goods){
    return service.addReturnedGoods(goods);
  }

  /**
   * 获取所有隐形眼镜质量投诉处理记录
   *
   * @return {@link S_complaint_record} 隐形眼镜质量投诉处理记录
   */
  @RequestMapping("/getComplaintRecord.do")
  @ResponseBody
  public List<S_complaint_record> getComplaintRecord() {
    return service.getComplaintRecord();
  }

  /**
   * 增加隐形眼镜质量投诉处理记录
   *
   * @param record {@link S_complaint_record}隐形眼镜质量投诉处理记录
   * @return {@link Boolean} true添加成功 false 添加失败
   */
  @RequestMapping("/addComplaintRecord.do")
  @ResponseBody
  public boolean addComplaintRecord(S_complaint_record record){
    return service.addComplaintRecord(record);
  }

  /**
   * 获取所有售后服务记录
   *
   * @return {@link S_after_sale_service} 售后服务记录
   */
  @RequestMapping("/getAfterSaleService.do")
  @ResponseBody
  public List<S_after_sale_service> getAfterSaleService() {
    return service.getAfterSaleService();
  }

  /**
   * 增加售后服务记录
   *
   * @param afterSaleService {@link S_after_sale_service} 售后服务记录
   * @return {@link Boolean} true添加成功 false 添加失败
   */
  @RequestMapping("/addAfterSaleService.do")
  @ResponseBody
  public boolean addAfterSaleService(S_after_sale_service afterSaleService){
    return service.addAfterSaleService(afterSaleService);
  }


}

