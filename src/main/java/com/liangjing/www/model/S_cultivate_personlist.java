package com.liangjing.www.model;

import org.springframework.stereotype.Repository;

public class S_cultivate_personlist {

    private Integer id;

    private Integer cultivateId;

    private String cultivateName;

    public Integer getCultivateId() {
        return cultivateId;
    }

    public void setCultivateId(Integer cultivateId) {
        this.cultivateId = cultivateId;
    }

    public String getCultivateName() {
        return cultivateName;
    }

    public void setCultivateName(String cultivateName) {
        this.cultivateName = cultivateName == null ? null : cultivateName.trim();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}