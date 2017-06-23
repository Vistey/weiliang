package com.liangjing.www.service;

import com.liangjing.www.dao.*;
import com.liangjing.www.model.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 证书处理模块
 */
@Service
public class CertificateService {

  @Resource
  private R_business_licenseMapper businessLicenseMapper;

  @Resource
  private R_medical_device_licenseMapper medicalLicenseMapper;

  @Resource
  private R_certificate_of_authorizationMapper certificateAuthorization;

  @Resource
  private R_medical_device_registrationMapper medicalDeviceRegistration;

  @Resource
  private CompanyMapper companyMapper;

  /**
   * 获取本公司营业执照
   *
   * @param workUnit 本公司名字
   * @return {@link R_business_license}本公司营业执照数据
   */
  public R_business_license getOurBusinessLicense(String workUnit) {
    return businessLicenseMapper.getOurBusinessLicense(workUnit);
  }

  /**
   * 获取首营公司营业执照
   *
   * @param workUnit 本公司名字（用于在结果集中排除）
   * @return {@link R_business_license}首营公司营业执照数据
   */
  public List<R_business_license> getGmpBusinessLicense(String workUnit) {
    return businessLicenseMapper.getGmpBusinessLicense(workUnit);
  }

  /**
   * 增加公司营业执照
   *
   * @param license {@link R_business_license} 营业执照数据
   * @return {@link Boolean} true添加成功 false 添加失败
   */
  public boolean addGmpBusinessLicense(R_business_license license) {
    return !(license.getCreditCode() == null && license.getDocumentNumber() == null &&
      license.getCompanyName() == null && license.getState() == null) && businessLicenseMapper.insertSelective(license) == 1;
  }

  /**
   * 获取本公司医疗器械营业执照
   *
   * @param workUnit 本公司名字
   * @return {@link R_medical_device_license}本公司医疗器械营业执照数据
   */
  public R_medical_device_license getOurMedicalLicense(String workUnit) {
    return medicalLicenseMapper.getOurMedicalLicense(workUnit);
  }

  /**
   * 获取首营公司医疗器械营业执照
   *
   * @param workUnit 本公司名字（用于在结果集中排除）
   * @return {@link R_medical_device_license}首营公司医疗器械营业执照数据
   */
  public List<R_medical_device_license> getGmpMedicalLicense(String workUnit) {
    return medicalLicenseMapper.getGmpMedicalLicense(workUnit);
  }

  /**
   * 增加医疗器械经营许可证
   *
   * @param license {@link R_medical_device_license} 医疗器械经营许可证
   * @return {@link Boolean} true添加成功 false 添加失败
   */
  public boolean addGmpMedicalLicense(R_medical_device_license license) {
    return medicalLicenseMapper.insertSelective(license) == 1;
  }

  /**
   * 获取所有授权书
   *
   * @return {@link R_certificate_of_authorization}授权书数据
   */
  public List<R_certificate_of_authorization> getCertificateOfAuthorization() {
    return certificateAuthorization.getCertificateOfAuthorization();
  }

  /**
   * 增加授权书
   *
   * @param authorization {@link R_certificate_of_authorization}授权书数据
   * @return {@link Boolean} true添加成功 false 添加失败
   */
  public boolean addAuthorization(R_certificate_of_authorization authorization) {
    return certificateAuthorization.insertSelective(authorization) == 1;
  }

  /**
   * 获取所有医疗器械注册证
   *
   * @return {@link R_medical_device_registration}医疗器械注册证数据
   */
  public List<R_medical_device_registration> getMedicalDeviceRegistration() {
    return medicalDeviceRegistration.getMedicalDeviceRegistration();
  }

  /**
   * 增加医疗器械注册证
   *
   * @param rMedicalDeviceRegistration {@link R_medical_device_registration}医疗器械注册证
   * @return {@link Boolean} true添加成功 false 添加失败
   */
  public boolean addGmpMedicalregistration(R_medical_device_registration rMedicalDeviceRegistration) {
    return medicalDeviceRegistration.insertSelective(rMedicalDeviceRegistration) == 1;
  }

  /**
   * 获取所有公司列表
   *
   * @return 返回所有公司列表
   */
  public List<String> getcompanyName() {
    return companyMapper.getListCompanyName();
  }

  /**
   * 添加公司
   *
   * @param companyname 添加的公司名
   * @return {@link Boolean} true添加成功 false 添加失败
   */
  public boolean addcompany(String companyname) {
    return companyMapper.addcompany(companyname) == 1;
  }

  /**
   * 获取已过期证书列表
   *
   * @return {@link String} 过去证书（证书类型--公司名）
   */
  public List<String> getCertificateExpired() {
    List<String> list = new ArrayList<>();
    List<String> ca = certificateAuthorization.getCertificateExpired();
    List<String> ml = medicalLicenseMapper.getCertificateExpired();
    List<String> mr = medicalDeviceRegistration.getCertificateExpired();
    if (ml.size() > 0){
      for (String tmp : ml){
        list.add("医疗器械许可证--" + tmp);
      }
    }
    if (ca.size() > 0) {
      for (String tmp : ca) {
        list.add("授权书--" + tmp);
      }
    }
    if (mr.size() > 0){
      for (String tmp : mr){
        list.add("医疗器械注册证--" + tmp);
      }
    }
    return list;
  }
}
