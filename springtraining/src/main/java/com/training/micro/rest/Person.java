package com.training.micro.rest;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "kisi")
public class Person {

    @Id
    @GeneratedValue
    //@JsonIgnore
    private Long         personId;
    @NotEmpty(message = "İsim boş olamaz")
    @Size(min = 2, max = 20, message = "İsim 2 ile 20 arasında olmalı")
    @Column(name = "isim")
    private String       name;
    @NotEmpty
    @Size(min = 2, max = 30)
    private String       surname;
    @NotNull
    @Past
    private LocalDate    birthday;
    @Max(300)
    @Min(1)
    private int          height;
    @NotNull
    @Enumerated(EnumType.STRING)
    private EGender      gender;

    @Embedded
    private PersonEx     personEx;

    @Fetch(FetchMode.JOIN)
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "person")
    private Set<Address> addrs;

    @Fetch(FetchMode.JOIN)
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "person")
    //@Transient
    private Set<Phone>   phones;

    @Fetch(FetchMode.JOIN)
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "person")
    // @JoinColumn(name = "psId")
    private PersonStatus personStatus;


    @PreRemove
    public void xyz1() {
        System.out.println("pre remove");
    }

    @PreUpdate
    public void xyz2() {
        System.out.println("pre update");
    }

    @PrePersist
    public void xyz3() {
        System.out.println("pre persist");
        this.name = "name:" + this.name;
    }

    @PostLoad
    public void xyz4() {
        this.name = this.name.substring(5);
        System.out.println("post load");
    }

    @PostPersist
    public void xyz6() {
        this.name = this.name.substring(5);
        System.out.println("post persist");
    }

    @PostRemove
    @PostUpdate
    public void xyz5() {
        System.out.println("post");
    }


    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(final String surnameParam) {
        this.surname = surnameParam;
    }

    public LocalDate getBirthday() {
        return this.birthday;
    }

    public void setBirthday(final LocalDate birthdayParam) {
        this.birthday = birthdayParam;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(final int heightParam) {
        this.height = heightParam;
    }

    public EGender getGender() {
        return this.gender;
    }

    public void setGender(final EGender genderParam) {
        this.gender = genderParam;
    }

    @Override
    public String toString() {
        return "Person [name="
               + this.name
               + ", surname="
               + this.surname
               + ", birthday="
               + this.birthday
               + ", height="
               + this.height
               + ", gender="
               + this.gender
               + "]";
    }

    public Long getPersonId() {
        return this.personId;
    }

    public void setPersonId(final Long personIdParam) {
        this.personId = personIdParam;
    }

    public PersonEx getPersonEx() {
        return this.personEx;
    }

    public void setPersonEx(final PersonEx personExParam) {
        this.personEx = personExParam;
    }

    public PersonStatus getPersonStatus() {
        return this.personStatus;
    }

    public void setPersonStatus(final PersonStatus personStatusParam) {
        this.personStatus = personStatusParam;
    }


    public Set<Address> getAddrs() {
        return this.addrs;
    }


    public void setAddrs(final Set<Address> addrsParam) {
        this.addrs = addrsParam;
    }


    public Set<Phone> getPhones() {
        return this.phones;
    }


    public void setPhones(final Set<Phone> phonesParam) {
        this.phones = phonesParam;
    }


}
