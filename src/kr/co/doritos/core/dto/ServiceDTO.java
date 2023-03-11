package kr.co.doritos.core.dto;

import java.util.List;

public class ServiceDTO {

    private String name;
    private String desc;
    private List<KeywordDTO> keywordList;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setKeywordList(List<KeywordDTO> keywordList) {
        this.keywordList = keywordList;
    }

    public List<KeywordDTO> getKeywordList() {
        return this.keywordList;
    }
}
