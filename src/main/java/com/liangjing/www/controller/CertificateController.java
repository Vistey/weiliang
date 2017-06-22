package com.liangjing.www.controller;

import com.liangjing.www.model.*;
import com.liangjing.www.service.CertificateService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 证书管理模块
 */
@Controller
@RequestMapping("certificate")
public class CertificateController {

  @Resource
  private CertificateService certificateService;

  /**
   * 获取本公司营业执照
   *
   * @param session session中记录的公司名字
   * @return {@link R_business_license} 返回本公司营业执照数据
   */
  @RequestMapping("/getOurBusinessLicense.do")
  @ResponseBody
  public R_business_license getOurBusinessLicense(HttpSession session) {
    return certificateService.getOurBusinessLicense((String) session.getAttribute("workUnit"));
  }

  /**
   * 获取首营公司营业执照
   *
   * @param session session中记录的公司名字（用于在结果集中排除本公司）
   * @return {@link R_business_license} 返回首营公司营业执照数据
   */
  @RequestMapping("/getGmpBusinessLicense.do")
  @ResponseBody
  public List<R_business_license> getGmpBusinessLicense(HttpSession session) {
    return certificateService.getGmpBusinessLicense((String) session.getAttribute("workUnit"));
  }

  /**
   * 增加公司营业执照
   *
   * @param license {@link R_business_license} 营业执照数据
   * @return {@link Boolean} true添加成功 false 添加失败
   */
  @RequestMapping("/addBusinessLicense.do")
  @ResponseBody
  public boolean addGmpBusinessLicense(R_business_license license) {
    return certificateService.addGmpBusinessLicense(license);
  }

  /**
   * 获取本公司医疗器械营业执照
   *
   * @param session session中记录的公司名字
   * @return {@link R_medical_device_license} 返回本医疗器械营业执照数据
   */
  @RequestMapping("/getOurMedicalLicense.do")
  @ResponseBody
  public R_medical_device_license getOurMedicalLicense(HttpSession session) {
    return certificateService.getOurMedicalLicense((String) session.getAttribute("workUnit"));
  }

  /**
   * 获取首营公司医疗器械营业执照
   *
   * @param session session中记录的公司名字（用于在结果集中排除本公司）
   * @return {@link R_medical_device_license} 返回首营医疗器械营业执照数据
   */
  @RequestMapping("/getGmpMedicalLicense.do")
  @ResponseBody
  public List<R_medical_device_license> getGmpMedicalLicense(HttpSession session) {
    return certificateService.getGmpMedicalLicense((String) session.getAttribute("workUnit"));
  }

  /**
   * 增加医疗器械营业执照
   *
   * @param license {@link R_medical_device_license} 医疗器械营业执照
   * @return {@link Boolean} true添加成功 false 添加失败
   */
  @RequestMapping("/addGmpMedicalLicense.do")
  @ResponseBody
  public boolean addGmpMedicalLicense(R_medical_device_license license) {
    return certificateService.addGmpMedicalLicense(license);
  }

  /**
   * 获取所有授权书
   *
   * @return {@link R_certificate_of_authorization} 返回所有授权书数据
   */
  @RequestMapping("/getCertificateOfAuthorization.do")
  @ResponseBody
  public List<R_certificate_of_authorization> getCertificateOfAuthorization() {
    return certificateService.getCertificateOfAuthorization();
  }

  /**
   * 增加授权书
   *
   * @param authorization {@link R_certificate_of_authorization}授权书
   * @return {@link Boolean} true添加成功 false 添加失败
   */
  @RequestMapping("/addAuthorization.do")
  @ResponseBody
  public boolean addAuthorization(R_certificate_of_authorization authorization) {
    return certificateService.addAuthorization(authorization);
  }

  /**
   * 获取所有医疗器械注册证
   *
   * @return {@link R_medical_device_registration} 返回所有医疗器械注册证数据
   */
  @RequestMapping("/getMedicalDeviceRegistration.do")
  @ResponseBody
  public List<R_medical_device_registration> getMedicalDeviceRegistration() {
    return certificateService.getMedicalDeviceRegistration();
  }

  /**
   * 增加医疗器械注册证
   *
   * @param rMedicalDeviceRegistration {@link R_medical_device_registration} 医疗器械注册证
   * @return {@link Boolean} true添加成功 false 添加失败
   */
  @RequestMapping("/addGmpMedicalregistration.do")
  @ResponseBody
  public boolean addGmpMedicalregistration(R_medical_device_registration rMedicalDeviceRegistration) {
    return certificateService.addGmpMedicalregistration(rMedicalDeviceRegistration);
  }

  /**
   * 获取所有公司列表
   *
   * @return 返回所有公司列表
   */
  @RequestMapping("/getcompanyName.do")
  @ResponseBody
  public List<String> getcompanyName() {
    return certificateService.getcompanyName();
  }

  /**
   * 增加公司
   *
   * @param companyname 添加的公司名
   * @return {@link Boolean} true添加成功 false 添加失败
   */
  @RequestMapping("/addcompany.do")
  @ResponseBody
  public boolean addcompany(String companyname) {
    return certificateService.addcompany(companyname);
  }




}
