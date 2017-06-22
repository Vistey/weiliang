package com.liangjing.www.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class C_optometrist extends Staff{
    private String idCard;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date dateOfIssue;

    private String certificateNumber;

    private String level;

    private String theoreticalScore;

    private String operationScore;

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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public String getTheoreticalScore() {
        return theoreticalScore;
    }

    public void setTheoreticalScore(String theoreticalScore) {
        this.theoreticalScore = theoreticalScore == null ? null : theoreticalScore.trim();
    }

    public String getOperationScore() {
        return operationScore;
    }

    public void setOperationScore(String operationScore) {
        this.operationScore = operationScore == null ? null : operationScore.trim();
    }

    public String getEvaluateScore() {
        return evaluateScore;
    }

    public void setEvaluateScore(String evaluateScore) {
        this.evaluateScore = evaluateScore == null ? null : evaluateScore.trim();
    }
}