package com.liangjing.www.service;

import com.liangjing.www.dao.*;
import com.liangjing.www.model.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 记录表处理模块
 */
@Service
public class RecordService {

  @Resource
  private S_warehousing_recordMapper warehousing_recordMapper;

  @Resource
  private S_sales_recordMapper sSalesRecordMapper;

  @Resource
  private S_trace_recordMapper traceRecord;

  @Resource
  private S_cultivate_recordMapper cultivate_recordMapper;

  @Resource
  private S_cultivate_personlistMapper cultivate_personlistMapper;

  @Resource
  private S_returned_goodsMapper returned_goodsMapper;


  /**
   * 获取所有入库记录
   *
   * @return {@link S_warehousing_record} 返回库存数据
   */
  public List<S_warehousing_record> allWarehousing() {
    return warehousing_recordMapper.getallWarehousing();
  }

  /**
   * 获取所有销售记录
   *
   * @return {@link S_sales_record} 返回销售数据
   */
  public List<S_sales_record> allSales() {
    return sSalesRecordMapper.getallSales();
  }

  /**
   * 添加库存记录
   *
   * @param record {@link S_warehousing_record} 库存数据对象
   * @return {@link Boolean} true添加成功 false 添加失败
   */
  public boolean addWarehousing(S_warehousing_record record) {
    return warehousing_recordMapper.insertSelective(record) == 1;
  }

  /**
   * 获取库存中批号
   *
   * @return {@link String}返回所有批号
   */
  public List<String> getAllWarehousingBatchNumber() {
    return warehousing_recordMapper.getAllBatchNumber();
  }

  /**
   * 添加销售记录
   *
   * @param record {@link S_sales_record} 销售数据
   * @return {@link Boolean} true添加成功 false 添加失败
   */
  public boolean addSales(S_sales_record record) {
    return sSalesRecordMapper.insertSelective(record) == 1;
  }

  /**
   * 获取所有质量跟踪记录
   *
   * @return {@link S_trace_record} 质量跟踪记录
   */
  public List<S_trace_record> getTraceRecord() {
    return traceRecord.getAll();
  }

  /**
   * 增加质量跟踪记录
   *
   * @param record {@link S_trace_record} 质量跟踪记录
   * @return {@link Boolean} true添加成功 false 添加失败
   */
  public boolean addTraceRecord(S_trace_record record) {
    return traceRecord.insertSelective(record) == 1;
  }

  /**
   * 获取所有员工培训计划
   *
   * @return {@link S_cultivate_record} 员工培训记录
   */
  public List<S_cultivate_record> getTrainingPlan() {
    List<S_cultivate_personlist> personList = cultivate_personlistMapper.selectAll();
    List<S_cultivate_record> sultivateList = cultivate_recordMapper.getAll();
    return cultivateMatching(sultivateList, personList);
  }



  /**
   * 培训计划表与员工数据匹配（一对多表赋值）
   *
   * @param cultivateRecord     培训计划表
   * @param cultivatePersonlist 员工与培训任务匹配
   * @return 培训计划表（整理完全后）
   */
  private List<S_cultivate_record> cultivateMatching(List<S_cultivate_record> cultivateRecord, List<S_cultivate_personlist> cultivatePersonlist) {
    int i = 0;
    int j = 0;
    while (i < cultivateRecord.size() && j < cultivatePersonlist.size()) {
      if ((int) cultivateRecord.get(i).getId() == cultivatePersonlist.get(j).getId()) {
        cultivateRecord.get(i).addPersonList(cultivatePersonlist.get(j));
        j++;
      } else if ((int) cultivateRecord.get(i).getId() > cultivatePersonlist.get(j).getId()) {
        j++;
      } else {
        i++;
      }
    }
    return cultivateRecord;
  }

  /**
   * 获取所有不合格产品记录
   *
   * @return {@link S_nonconformity_record} 不合格产品记录
   */
  public List<S_nonconformity_record> getNonconformity() {
    return null;
  }

  /**
   * 获取所有顾客退换片记录
   * @return {@link S_returned_goods} 顾客退换片记录
   */
  public List<S_returned_goods> getReturnedGoods() {
    return returned_goodsMapper.getAll();
  }


}
