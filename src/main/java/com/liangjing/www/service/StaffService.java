package com.liangjing.www.service;

import com.liangjing.www.dao.C_contact_lens_clerkMapper;
import com.liangjing.www.dao.C_contact_lens_managerMapper;
import com.liangjing.www.dao.C_optometristMapper;
import com.liangjing.www.dao.StaffMapper;
import com.liangjing.www.model.C_contact_lens_clerk;
import com.liangjing.www.model.C_contact_lens_manager;
import com.liangjing.www.model.C_optometrist;
import com.liangjing.www.model.Staff;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 员工处理模块
 */

@Service
public class StaffService {

  @Resource
  private C_contact_lens_clerkMapper clerkMapper;

  @Resource
  private C_contact_lens_managerMapper managerMapper;

  @Resource
  private C_optometristMapper optometristMapper;

  @Resource
  private StaffMapper staffMapper;

  /**
   * 获取所有角膜接触镜营业员
   * @return 角膜接触镜营业员list集合
   */
  public List<C_contact_lens_clerk> allCLC(){
    return clerkMapper.allCLC();
  }

  /**
   * 获取所有角膜接触镜质量管理员
   * @return 膜接触镜质量管理员list集合
   */
  public List<C_contact_lens_manager> allCLM(){
    return managerMapper.allCLM();
  }

  /**
   * 获取所有眼镜验光员
   * @return 眼镜验光员list集合
   */
  public List<C_optometrist> allallOptometrist() {
    return optometristMapper.allOptometrist();
  }

  public List<Staff> allStaff() {
    return staffMapper.allStaff();
  }

}
