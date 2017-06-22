package com.liangjing.www.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class S_cultivate_record {

  private Integer id;

  private String cultivateContent;

  private List<S_cultivate_personlist> personlists;

  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  private Date cultivateDate;

  private String cultivateWay;

  private String cultivateAddress;

  public Integer getId() {
    return id;
  }

  /**
   * 将{@link S_cultivate_personlist}添加进 培训计划表中的员工集合中
   *
   * @param personlist {@link S_cultivate_personlist} 员工对象
   */
  public void addPersonList(S_cultivate_personlist personlist) {
    if (this.personlists == null){
      personlists = new ArrayList<>();
    }
    personlists.add(personlist);
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getCultivateContent() {
    return cultivateContent;
  }

  public void setCultivateContent(String cultivateContent) {
    this.cultivateContent = cultivateContent == null ? null : cultivateContent.trim();
  }

  public Date getCultivateDate() {
    return cultivateDate;
  }

  public void setCultivateDate(Date cultivateDate) {
    this.cultivateDate = cultivateDate;
  }

  public String getCultivateWay() {
    return cultivateWay;
  }

  public void setCultivateWay(String cultivateWay) {
    this.cultivateWay = cultivateWay == null ? null : cultivateWay.trim();
  }

  public String getCultivateAddress() {
    return cultivateAddress;
  }

  public void setCultivateAddress(String cultivateAddress) {
    this.cultivateAddress = cultivateAddress == null ? null : cultivateAddress.trim();
  }

  public List<S_cultivate_personlist> getPersonlists() {
    return personlists;
  }

  public void setPersonlists(List<S_cultivate_personlist> personlists) {
    this.personlists = personlists;
  }
}