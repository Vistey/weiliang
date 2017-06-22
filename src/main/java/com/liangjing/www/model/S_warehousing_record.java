package com.liangjing.www.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class S_warehousing_record {

    private String batchNumber;

    private String commodityType;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date purchaseDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date inspectionDate;

    private String productName;

    private String companyName;

    private String vertexFocus;

    private String chineseLogo;

    private Integer quantityPurchased;

    private Integer stockNumber;

    private Integer packageIntegrity;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date productionDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date termOfValidity;

    private Integer buyingPrice;

    private String acceptanceConclusion;

    private String confirmingPerson;

    private Integer state;

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber == null ? null : batchNumber.trim();
    }

    public String getCommodityType() {
        return commodityType;
    }

    public void setCommodityType(String commodityType) {
        this.commodityType = commodityType == null ? null : commodityType.trim();
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Date getInspectionDate() {
        return inspectionDate;
    }

    public void setInspectionDate(Date inspectionDate) {
        this.inspectionDate = inspectionDate;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getVertexFocus() {
        return vertexFocus;
    }

    public void setVertexFocus(String vertexFocus) {
        this.vertexFocus = vertexFocus == null ? null : vertexFocus.trim();
    }

    public String getChineseLogo() {
        return chineseLogo;
    }

    public void setChineseLogo(String chineseLogo) {
        this.chineseLogo = chineseLogo == null ? null : chineseLogo.trim();
    }

    public Integer getQuantityPurchased() {
        return quantityPurchased;
    }

    public void setQuantityPurchased(Integer quantityPurchased) {
        this.quantityPurchased = quantityPurchased;
    }

    public Integer getStockNumber() {
        return stockNumber;
    }

    public void setStockNumber(Integer stockNumber) {
        this.stockNumber = stockNumber;
    }

    public Integer getPackageIntegrity() {
        return packageIntegrity;
    }

    public void setPackageIntegrity(Integer packageIntegrity) {
        this.packageIntegrity = packageIntegrity;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    public Date getTermOfValidity() {
        return termOfValidity;
    }

    public void setTermOfValidity(Date termOfValidity) {
        this.termOfValidity = termOfValidity;
    }

    public Integer getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(Integer buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public String getAcceptanceConclusion() {
        return acceptanceConclusion;
    }

    public void setAcceptanceConclusion(String acceptanceConclusion) {
        this.acceptanceConclusion = acceptanceConclusion == null ? null : acceptanceConclusion.trim();
    }

    public String getConfirmingPerson() {
        return confirmingPerson;
    }

    public void setConfirmingPerson(String confirmingPerson) {
        this.confirmingPerson = confirmingPerson == null ? null : confirmingPerson.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}