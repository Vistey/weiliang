package com.liangjing.www.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class C_contact_lens_manager extends Staff {

  private String idCard;

  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  private Date dateOfIssue;

  private String certificateNumber;

  private String evaluateScore;

  public String getIdCard() {
    return idCard;
  }

  public void setIdCard(String idCard) {
    this.idCard = idCard == null ? null : idCard.trim();
  }

  public Date getDateOfIssue() {
    return dateOfIssue;
  }

  public void setDateOfIssue(Date dateOfIssue) {
    this.dateOfIssue = dateOfIssue;
  }

  public String getCertificateNumber() {
    return certificateNumber;
  }

  public void setCertificateNumber(String certificateNumber) {
    this.certificateNumber = certificateNumber == null ? null : certificateNumber.trim();
  }

  public String getEvaluateScore() {
    return evaluateScore;
  }

  public void setEvaluateScore(String evaluateScore) {
    this.evaluateScore = evaluateScore;
  }
}