package com.liangjing.www.controller;

import com.liangjing.www.model.Staff;
import com.liangjing.www.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * 处理所有关于用户参数
 */

@Controller
@RequestMapping("/userset")
public class UserSet {

  @Resource
  private UserService userService;

  /**
   * 处理用户登录操纵
   * 将用户名字 工作单位 记录在session中
   * @param staff 用户输入的用户名和密码
   * @param session 用于记录session 以便filter不再拦截
   * @return 登录成功返回字符串 true 和false
   */
  @RequestMapping("/login.do")
  public @ResponseBody boolean login(Staff staff, HttpSession session) {
    if (userService.userLogin(staff) == 1){
      Staff user = userService.getStaff(staff.getIdCard());
      session.setAttribute("workUnit",user.getWorkUnit());
      session.setAttribute("idCard",staff.getIdCard());
      session.setAttribute("name",user.getName());
      return true;
    }
    return false;
  }

  /**
   * 处理用户登出操作
   * @param session 删除session记录 实现登出操作
   * @return 登出操作成功返回字符串 true 和false
   */
  @RequestMapping("/logout.do")
  public @ResponseBody boolean logout(HttpSession session){
    if (session.getAttribute("idCard") != null){
      session.removeAttribute("idCard");
      session.removeAttribute("workUnit");
      session.removeAttribute("name");
      return true;
    }
    return false;
  }



}
