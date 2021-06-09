package com.training.micro.config;


public class LanguageInfo {

    private String shortName;
    private String name;
    private String desc;

    public String getShortName() {
        return this.shortName;
    }

    public void setShortName(final String shortNameParam) {
        this.shortName = shortNameParam;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(final String descParam) {
        this.desc = descParam;
    }

    @Override
    public String toString() {
        return "LanguageInfo [shortName=" + this.shortName + ", name=" + this.name + ", desc=" + this.desc + "]";
    }


}
