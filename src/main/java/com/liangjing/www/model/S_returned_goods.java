package com.liangjing.www.model;

import java.util.Date;

public class S_returned_goods {
    private Integer id;

    private String customerPhone;

    private String customerPostcard;

    private String customerAddress;

    private String batchNumberL;

    private String batchNumberR;

    private String glassesDegreeL;

    private String glassesDegreeR;

    private Date opticianDate;

    private Date returnedDate;

    private String handler;

    private String returnedReason;

    private String findings;

    private String glassesLDegree;

    private String glassesRDegree;

    private Date dateOptician;

    private Date dateReturned;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone == null ? null : customerPhone.trim();
    }

    public String getCustomerPostcard() {
        return customerPostcard;
    }

    public void setCustomerPostcard(String customerPostcard) {
        this.customerPostcard = customerPostcard == null ? null : customerPostcard.trim();
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress == null ? null : customerAddress.trim();
    }

    public String getBatchNumberL() {
        return batchNumberL;
    }

    public void setBatchNumberL(String batchNumberL) {
        this.batchNumberL = batchNumberL == null ? null : batchNumberL.trim();
    }

    public String getBatchNumberR() {
        return batchNumberR;
    }

    public void setBatchNumberR(String batchNumberR) {
        this.batchNumberR = batchNumberR == null ? null : batchNumberR.trim();
    }

    public String getGlassesDegreeL() {
        return glassesDegreeL;
    }

    public void setGlassesDegreeL(String glassesDegreeL) {
        this.glassesDegreeL = glassesDegreeL == null ? null : glassesDegreeL.trim();
    }

    public String getGlassesDegreeR() {
        return glassesDegreeR;
    }

    public void setGlassesDegreeR(String glassesDegreeR) {
        this.glassesDegreeR = glassesDegreeR == null ? null : glassesDegreeR.trim();
    }

    public Date getOpticianDate() {
        return opticianDate;
    }

    public void setOpticianDate(Date opticianDate) {
        this.opticianDate = opticianDate;
    }

    public Date getReturnedDate() {
        return returnedDate;
    }

    public void setReturnedDate(Date returnedDate) {
        this.returnedDate = returnedDate;
    }

    public String getHandler() {
        return handler;
    }

    public void setHandler(String handler) {
        this.handler = handler == null ? null : handler.trim();
    }

    public String getReturnedReason() {
        return returnedReason;
    }

    public void setReturnedReason(String returnedReason) {
        this.returnedReason = returnedReason == null ? null : returnedReason.trim();
    }

    public String getFindings() {
        return findings;
    }

    public void setFindings(String findings) {
        this.findings = findings == null ? null : findings.trim();
    }

    public String getGlassesLDegree() {
        return glassesLDegree;
    }

    public void setGlassesLDegree(String glassesLDegree) {
        this.glassesLDegree = glassesLDegree == null ? null : glassesLDegree.trim();
    }

    public String getGlassesRDegree() {
        return glassesRDegree;
    }

    public void setGlassesRDegree(String glassesRDegree) {
        this.glassesRDegree = glassesRDegree == null ? null : glassesRDegree.trim();
    }

    public Date getDateOptician() {
        return dateOptician;
    }

    public void setDateOptician(Date dateOptician) {
        this.dateOptician = dateOptician;
    }

    public Date getDateReturned() {
        return dateReturned;
    }

    public void setDateReturned(Date dateReturned) {
        this.dateReturned = dateReturned;
    }
}