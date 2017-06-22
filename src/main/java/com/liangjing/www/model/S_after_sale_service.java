package com.liangjing.www.model;

import java.util.Date;

public class S_after_sale_service {
    private Integer id;

    private Date date;

    private String customer;

    private String treatmentMode;

    private String processingSheet;

    private String handlers;

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

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer == null ? null : customer.trim();
    }

    public String getTreatmentMode() {
        return treatmentMode;
    }

    public void setTreatmentMode(String treatmentMode) {
        this.treatmentMode = treatmentMode == null ? null : treatmentMode.trim();
    }

    public String getProcessingSheet() {
        return processingSheet;
    }

    public void setProcessingSheet(String processingSheet) {
        this.processingSheet = processingSheet == null ? null : processingSheet.trim();
    }

    public String getHandlers() {
        return handlers;
    }

    public void setHandlers(String handlers) {
        this.handlers = handlers == null ? null : handlers.trim();
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
        this.remarks = remarks == null ? null : remarks.trim();
    }
}