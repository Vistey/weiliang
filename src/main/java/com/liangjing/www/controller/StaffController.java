package com.liangjing.www.controller;

import com.liangjing.www.model.C_contact_lens_clerk;
import com.liangjing.www.model.C_contact_lens_manager;
import com.liangjing.www.model.C_optometrist;
import com.liangjing.www.model.Staff;
import com.liangjing.www.service.StaffService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * 负责所有员工管理模块的处理
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")

@Controller
@RequestMapping("staff")
public class StaffController {

  @Resource
  private StaffService staffService;

  /**
   * 所有角膜接触镜营业员
   *
   * @return 数据列表
   */
  @RequestMapping("/allCLC.do")
  @ResponseBody
  public List<C_contact_lens_clerk> allCLC() {
    return staffService.allCLC();
  }

  /**
   * 所有角膜接触镜管理员
   *
   * @return 数据列表
   */
  @RequestMapping("/allCLM.do")
  @ResponseBody
  public List<C_contact_lens_manager> allCLM() {
    return staffService.allCLM();
  }

  /**
   * 所有眼镜验光员
   *
   * @return 数据列表
   */
  @RequestMapping("/allOptometrist.do")
  @ResponseBody
  public List<C_optometrist> allOptometrist() {
    return staffService.allallOptometrist();
  }

  /**
   * 所有员工数据库
   *
   * @return {@link Staff} 员工数据
   */
  @RequestMapping("/allStaff.do")
  @ResponseBody
  public List<Staff> allStaff() {
    return staffService.allStaff();
  }


}
