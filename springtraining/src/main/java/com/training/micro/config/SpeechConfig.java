package com.training.micro.config;


import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "speech")
public class SpeechConfig {

    private String                    language;
    private List<String>              languageList;
    private Map<String, String>       languageDescs;
    private LanguageInfo              currentLanguageInfo;
    private List<LanguageInfo>        languageInfos;
    private Map<String, LanguageInfo> languageInfoMap;

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(final String languageParam) {
        this.language = languageParam;
    }

    public List<String> getLanguageList() {
        return this.languageList;
    }

    public void setLanguageList(final List<String> languageListParam) {
        this.languageList = languageListParam;
    }

    public Map<String, String> getLanguageDescs() {
        return this.languageDescs;
    }

    public void setLanguageDescs(final Map<String, String> languageDescsParam) {
        this.languageDescs = languageDescsParam;
    }


    public LanguageInfo getCurrentLanguageInfo() {
        return this.currentLanguageInfo;
    }


    public void setCurrentLanguageInfo(final LanguageInfo currentLanguageInfoParam) {
        this.currentLanguageInfo = currentLanguageInfoParam;
    }


    public List<LanguageInfo> getLanguageInfos() {
        return this.languageInfos;
    }


    public void setLanguageInfos(final List<LanguageInfo> languageInfosParam) {
        this.languageInfos = languageInfosParam;
    }


    public Map<String, LanguageInfo> getLanguageInfoMap() {
        return this.languageInfoMap;
    }


    public void setLanguageInfoMap(final Map<String, LanguageInfo> languageInfoMapParam) {
        this.languageInfoMap = languageInfoMapParam;
    }

    @Override
    public String toString() {
        return "SpeechConfig [language="
               + this.language
               + ", languageList="
               + this.languageList
               + ", languageDescs="
               + this.languageDescs
               + ", currentLanguageInfo="
               + this.currentLanguageInfo
               + ", languageInfos="
               + this.languageInfos
               + ", languageInfoMap="
               + this.languageInfoMap
               + "]";
    }


}
