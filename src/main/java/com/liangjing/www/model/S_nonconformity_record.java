package com.liangjing.www.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class S_nonconformity_record {

    private Integer id;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date today;

    private String batchNumber;

    private String descriptionGoods;

    private String contract;

    private String manufacturer;

    private String qualityProblem;

    private String inspectorSuggested;

    private String auditConclusion;

    private String eventTracking;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getToday() {
        return today;
    }

    public void setToday(Date today) {
        this.today = today;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber == null ? null : batchNumber.trim();
    }

    public String getDescriptionGoods() {
        return descriptionGoods;
    }

    public void setDescriptionGoods(String descriptionGoods) {
        this.descriptionGoods = descriptionGoods == null ? null : descriptionGoods.trim();
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract == null ? null : contract.trim();
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer == null ? null : manufacturer.trim();
    }

    public String getQualityProblem() {
        return qualityProblem;
    }

    public void setQualityProblem(String qualityProblem) {
        this.qualityProblem = qualityProblem == null ? null : qualityProblem.trim();
    }

    public String getInspectorSuggested() {
        return inspectorSuggested;
    }

    public void setInspectorSuggested(String inspectorSuggested) {
        this.inspectorSuggested = inspectorSuggested == null ? null : inspectorSuggested.trim();
    }

    public String getAuditConclusion() {
        return auditConclusion;
    }

    public void setAuditConclusion(String auditConclusion) {
        this.auditConclusion = auditConclusion == null ? null : auditConclusion.trim();
    }

    public String getEventTracking() {
        return eventTracking;
    }

    public void setEventTracking(String eventTracking) {
        this.eventTracking = eventTracking == null ? null : eventTracking.trim();
    }
}