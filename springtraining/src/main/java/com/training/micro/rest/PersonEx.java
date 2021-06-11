package com.training.micro.rest;

import javax.persistence.Embeddable;

@Embeddable
public class PersonEx {

    private String  etraDesc;
    private Integer etraValue;

    public String getEtraDesc() {
        return this.etraDesc;
    }

    public void setEtraDesc(final String etraDescParam) {
        this.etraDesc = etraDescParam;
    }

    public Integer getEtraValue() {
        return this.etraValue;
    }

    public void setEtraValue(final Integer etraValueParam) {
        this.etraValue = etraValueParam;
    }


}
