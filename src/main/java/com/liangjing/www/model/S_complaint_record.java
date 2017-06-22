package com.liangjing.www.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class S_complaint_record {

    private Integer id;

    private String customer;

    private String customerContact;

    private String shopName;

    private String shopContact;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date buyTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date complaintTime;

    private String typeSpecification;

    private Integer glassesNumber;

    private String markDegree;

    private String lensNumber;

    private Integer wearHistory;

    private String originalBrandModels;

    private String originalGlassesNumberL;

    private String originalGlassesNumberR;

    private String optometryDegreeL;

    private String optometryDegreeR;

    private String wearSightL;

    private String wearSightR;

    private String customerComplaintContent;

    private String storeExaminationResult;

    private String glassesExaminationResult;

    private String procurator;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer == null ? null : customer.trim();
    }

    public String getCustomerContact() {
        return customerContact;
    }

    public void setCustomerContact(String customerContact) {
        this.customerContact = customerContact == null ? null : customerContact.trim();
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public String getShopContact() {
        return shopContact;
    }

    public void setShopContact(String shopContact) {
        this.shopContact = shopContact == null ? null : shopContact.trim();
    }

    public Date getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(Date buyTime) {
        this.buyTime = buyTime;
    }

    public Date getComplaintTime() {
        return complaintTime;
    }

    public void setComplaintTime(Date complaintTime) {
        this.complaintTime = complaintTime;
    }

    public String getTypeSpecification() {
        return typeSpecification;
    }

    public void setTypeSpecification(String typeSpecification) {
        this.typeSpecification = typeSpecification == null ? null : typeSpecification.trim();
    }

    public Integer getGlassesNumber() {
        return glassesNumber;
    }

    public void setGlassesNumber(Integer glassesNumber) {
        this.glassesNumber = glassesNumber;
    }

    public String getMarkDegree() {
        return markDegree;
    }

    public void setMarkDegree(String markDegree) {
        this.markDegree = markDegree == null ? null : markDegree.trim();
    }

    public String getLensNumber() {
        return lensNumber;
    }

    public void setLensNumber(String lensNumber) {
        this.lensNumber = lensNumber == null ? null : lensNumber.trim();
    }

    public Integer getWearHistory() {
        return wearHistory;
    }

    public void setWearHistory(Integer wearHistory) {
        this.wearHistory = wearHistory;
    }

    public String getOriginalBrandModels() {
        return originalBrandModels;
    }

    public void setOriginalBrandModels(String originalBrandModels) {
        this.originalBrandModels = originalBrandModels == null ? null : originalBrandModels.trim();
    }

    public String getOriginalGlassesNumberL() {
        return originalGlassesNumberL;
    }

    public void setOriginalGlassesNumberL(String originalGlassesNumberL) {
        this.originalGlassesNumberL = originalGlassesNumberL == null ? null : originalGlassesNumberL.trim();
    }

    public String getOriginalGlassesNumberR() {
        return originalGlassesNumberR;
    }

    public void setOriginalGlassesNumberR(String originalGlassesNumberR) {
        this.originalGlassesNumberR = originalGlassesNumberR == null ? null : originalGlassesNumberR.trim();
    }

    public String getOptometryDegreeL() {
        return optometryDegreeL;
    }

    public void setOptometryDegreeL(String optometryDegreeL) {
        this.optometryDegreeL = optometryDegreeL == null ? null : optometryDegreeL.trim();
    }

    public String getOptometryDegreeR() {
        return optometryDegreeR;
    }

    public void setOptometryDegreeR(String optometryDegreeR) {
        this.optometryDegreeR = optometryDegreeR == null ? null : optometryDegreeR.trim();
    }

    public String getWearSightL() {
        return wearSightL;
    }

    public void setWearSightL(String wearSightL) {
        this.wearSightL = wearSightL == null ? null : wearSightL.trim();
    }

    public String getWearSightR() {
        return wearSightR;
    }

    public void setWearSightR(String wearSightR) {
        this.wearSightR = wearSightR == null ? null : wearSightR.trim();
    }

    public String getCustomerComplaintContent() {
        return customerComplaintContent;
    }

    public void setCustomerComplaintContent(String customerComplaintContent) {
        this.customerComplaintContent = customerComplaintContent == null ? null : customerComplaintContent.trim();
    }

    public String getStoreExaminationResult() {
        return storeExaminationResult;
    }

    public void setStoreExaminationResult(String storeExaminationResult) {
        this.storeExaminationResult = storeExaminationResult == null ? null : storeExaminationResult.trim();
    }

    public String getGlassesExaminationResult() {
        return glassesExaminationResult;
    }

    public void setGlassesExaminationResult(String glassesExaminationResult) {
        this.glassesExaminationResult = glassesExaminationResult == null ? null : glassesExaminationResult.trim();
    }

    public String getProcurator() {
        return procurator;
    }

    public void setProcurator(String procurator) {
        this.procurator = procurator == null ? null : procurator.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}