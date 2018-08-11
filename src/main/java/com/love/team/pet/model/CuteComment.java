package com.love.team.pet.model;

import java.util.Date;

public class CuteComment {
    private String id;

    private String userId;

    private Date time;

    private Integer fabulos;

    private String content;

    private String themeId;

    public String getThemeId() {
        return themeId;
    }

    public void setThemeId(String themeId) {
        this.themeId = themeId;
    }

    @Override
    public String toString() {
        return "CuteComment{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", time=" + time +
                ", fabulos=" + fabulos +
                ", content='" + content + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getFabulos() {
        return fabulos;
    }

    public void setFabulos(Integer fabulos) {
        this.fabulos = fabulos;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}