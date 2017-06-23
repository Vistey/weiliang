package com.liangjing.www.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class S_after_sale_service {

    private Integer id;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date date;

    private String customerContent;

    private String treatmentMode;

    private String processingSheet;

    private String handlers;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date closeDate;

    private String remarks;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCustomerContent() {
        return customerContent;
    }

    public void setCustomerContent(String customerContent) {
        this.customerContent = customerContent;
    }

    public String getTreatmentMode() {
        return treatmentMode;
    }

    public void setTreatmentMode(String treatmentMode) {
        this.treatmentMode = treatmentMode;
    }

    public String getProcessingSheet() {
        return processingSheet;
    }

    public void setProcessingSheet(String processingSheet) {
        this.processingSheet = processingSheet;
    }

    public String getHandlers() {
        return handlers;
    }

    public void setHandlers(String handlers) {
        this.handlers = handlers;
    }

    public Date getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

}