package kr.co.doritos.core.dto;

public class KeywordDTO {

    private String keyword;
    private String mark;

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return this.mark;
    }

    @Override
    public String toString() {
        return String.format("KeywordDTO={keyword=%s, mark=%s}", this.keyword, this.mark);
    }
}
