package com.training.micro.rest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Address {

    @Id
    @GeneratedValue
    private Long   addrId;
    private String addr;
    private String city;

    @ManyToOne
    @JsonIgnore
    private Person person;

    public String getAddr() {
        return this.addr;
    }

    public void setAddr(final String addrParam) {
        this.addr = addrParam;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(final String cityParam) {
        this.city = cityParam;
    }

    public Long getAddrId() {
        return this.addrId;
    }

    public void setAddrId(final Long addrIdParam) {
        this.addrId = addrIdParam;
    }

    public Person getPerson() {
        return this.person;
    }

    public void setPerson(final Person personParam) {
        this.person = personParam;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) + ((this.addr == null) ? 0 : this.addr.hashCode());
        result = (prime * result) + ((this.addrId == null) ? 0 : this.addrId.hashCode());
        result = (prime * result) + ((this.city == null) ? 0 : this.city.hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Address other = (Address) obj;
        if (this.addr == null) {
            if (other.addr != null) {
                return false;
            }
        } else if (!this.addr.equals(other.addr)) {
            return false;
        }
        if (this.addrId == null) {
            if (other.addrId != null) {
                return false;
            }
        } else if (!this.addrId.equals(other.addrId)) {
            return false;
        }
        if (this.city == null) {
            if (other.city != null) {
                return false;
            }
        } else if (!this.city.equals(other.city)) {
            return false;
        }
        return true;
    }


}
