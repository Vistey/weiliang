package com.liangjing.www.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

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

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date opticianDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date returnedDate;

    private String handler;

    private String returnedReason;

    private String handlerFindings;

    private String qualityController;


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
        this.customerPhone = customerPhone;
    }

    public String getCustomerPostcard() {
        return customerPostcard;
    }

    public void setCustomerPostcard(String customerPostcard) {
        this.customerPostcard = customerPostcard;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getBatchNumberL() {
        return batchNumberL;
    }

    public void setBatchNumberL(String batchNumberL) {
        this.batchNumberL = batchNumberL;
    }

    public String getBatchNumberR() {
        return batchNumberR;
    }

    public void setBatchNumberR(String batchNumberR) {
        this.batchNumberR = batchNumberR;
    }

    public String getGlassesDegreeL() {
        return glassesDegreeL;
    }

    public void setGlassesDegreeL(String glassesDegreeL) {
        this.glassesDegreeL = glassesDegreeL;
    }

    public String getGlassesDegreeR() {
        return glassesDegreeR;
    }

    public void setGlassesDegreeR(String glassesDegreeR) {
        this.glassesDegreeR = glassesDegreeR;
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
        this.handler = handler;
    }

    public String getReturnedReason() {
        return returnedReason;
    }

    public void setReturnedReason(String returnedReason) {
        this.returnedReason = returnedReason;
    }

    public String getHandlerFindings() {
        return handlerFindings;
    }

    public void setHandlerFindings(String handlerFindings) {
        this.handlerFindings = handlerFindings;
    }

    public String getQualityController() {
        return qualityController;
    }

    public void setQualityController(String qualityController) {
        this.qualityController = qualityController;
    }
}