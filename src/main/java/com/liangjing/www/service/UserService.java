package com.liangjing.www.service;

import com.liangjing.www.dao.StaffMapper;
import com.liangjing.www.model.Staff;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 用于处理关于用户设置等的所有请求
 */
@Service
public class UserService {

  @Resource
  private StaffMapper staffMapper;

  /**
   * 用户登录操作
   *
   * @param staff 用户输入数据 只包含身份证编号 登录密码
   * @return 返回1 代表登录成功,非1代表失败
   */
  public int userLogin(Staff staff) {
    return staffMapper.userLogin(staff);
  }

  /**
   * 根据身份证号码获取 用户对象
   *
   * @param idCard 用户ID号
   * @return {@link Staff} 用户对象
   */
  public Staff getStaff(String idCard) {
    return staffMapper.selectByPrimaryKey(idCard);
  }

  /**
   * 身份证编号获取用户名字
   *
   * @param idCard 身份证号
   * @return 用户名字
   */
  public String getName(String idCard) {
    return staffMapper.getName(idCard);
  }
}
