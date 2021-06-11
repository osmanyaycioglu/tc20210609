package com.training.micro.rest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class PersonStatus {

    @Id
    @GeneratedValue
    private Long    psId;
    private String  partnerName;
    private Boolean married;

    @OneToOne
    @JsonIgnore
    @JoinColumn(name = "personId")
    private Person  person;

    public String getPartnerName() {
        return this.partnerName;
    }

    public void setPartnerName(final String partnerNameParam) {
        this.partnerName = partnerNameParam;
    }

    public Boolean getMarried() {
        return this.married;
    }

    public void setMarried(final Boolean marriedParam) {
        this.married = marriedParam;
    }

    public Person getPerson() {
        return this.person;
    }

    public void setPerson(final Person personParam) {
        this.person = personParam;
    }


}
