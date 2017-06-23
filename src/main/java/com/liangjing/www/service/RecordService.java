package com.liangjing.www.service;

import com.liangjing.www.dao.*;
import com.liangjing.www.model.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
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
  private S_after_sale_serviceMapper afterSaleServiceMapper;

  @Resource
  private S_nonconformity_recordMapper nonconformityRecordMapper;

  @Resource
  private S_returned_goodsMapper returnedGoodsMapper;

  @Resource
  private S_complaint_recordMapper complaintRecordMapper;

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
   * 添加培训计划表
   *
   * @param cultivateRecord {@link S_cultivate_record}培训计划表
   * @return {@link Boolean} true添加成功 false 添加失败
   */
  @Transactional
  public boolean addTrainingPlan(S_cultivate_record cultivateRecord){
    cultivate_recordMapper.insertSelectiveBackId(cultivateRecord);
    for (S_cultivate_personlist list : cultivateRecord.getPersonlists()){
      list.setCultivateId(cultivateRecord.getId());
      cultivate_personlistMapper.insertSelective(list);
    }
    return true;
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
      if ((int) cultivateRecord.get(i).getId() == cultivatePersonlist.get(j).getCultivateId()) {
        cultivateRecord.get(i).addPersonList(cultivatePersonlist.get(j));
        j++;
      } else if ((int) cultivateRecord.get(i).getId() > cultivatePersonlist.get(j).getCultivateId()) {
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
    return nonconformityRecordMapper.getAll();
  }

  /**
   * 获取所有顾客退换片记录
   * @return {@link S_returned_goods} 顾客退换片记录
   */
  public List<S_returned_goods> getReturnedGoods() {
    return returnedGoodsMapper.getAll();
  }

  /**
   * 获取所有隐形眼镜质量投诉处理记录
   * @return {@link S_complaint_record} 隐形眼镜质量投诉处理记录
   */
  public List<S_complaint_record> getComplaintRecord() {
    return complaintRecordMapper.getAll();
  }

  /**
   * 获取所有售后服务记录
   * @return {@link S_after_sale_service} 售后服务记录
   */
  public List<S_after_sale_service> getAfterSaleService() {
    return afterSaleServiceMapper.getAll();
  }

  /**
   * 增加不合格产品记录
   *
   * @param record {@link S_nonconformity_record} 不合格产品记录
   * @return {@link Boolean} true添加成功 false 添加失败
   */
  public boolean addNonconformity(S_nonconformity_record record) {
    record.setToday(new Date());
    return nonconformityRecordMapper.insertSelective(record) == 1;
  }

  /**
   * 增加顾客退换片记录
   *
   * @param goods {@link S_returned_goods} 顾客退换片记录
   * @return {@link Boolean} true添加成功 false 添加失败
   */
  public boolean addReturnedGoods(S_returned_goods goods) {
    return returnedGoodsMapper.insertSelective(goods) == 1;
  }

  /**
   * 增加隐形眼镜质量投诉处理记录
   *
   * @param record {@link S_complaint_record}隐形眼镜质量投诉处理记录
   * @return {@link Boolean} true添加成功 false 添加失败
   */
  public boolean addComplaintRecord(S_complaint_record record) {
    record.setDate(new Date());
    return complaintRecordMapper.insertSelective(record) == 1;
  }

  /**
   * 增加售后服务记录
   *
   * @param afterSaleService {@link S_after_sale_service} 售后服务记录
   * @return {@link Boolean} true添加成功 false 添加失败
   */
  public boolean addAfterSaleService(S_after_sale_service afterSaleService) {
    afterSaleService.setDate(new Date());
    return afterSaleServiceMapper.insertSelective(afterSaleService) == 1;
  }
}
