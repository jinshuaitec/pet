package com.love.team.pet.model;

import java.util.List;

public class Theme extends BaseEntity {

    private String userId;

    private List<PagePicture> pagePicture;

    private List<CuteComment> cuteComments;

    private String commentId;

    private Integer fabulous;

    private String content;

    private String date;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<PagePicture> getPagePicture() {
        return pagePicture;
    }

    public void setPagePicture(List<PagePicture> pagePicture) {
        this.pagePicture = pagePicture;
    }

    public List<CuteComment> getCuteComments() {
        return cuteComments;
    }

    public void setCuteComments(List<CuteComment> cuteComments) {
        this.cuteComments = cuteComments;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public Integer getFabulous() {
        return fabulous;
    }

    public void setFabulous(Integer fabulous) {
        this.fabulous = fabulous;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Theme{" +
                "id="+super.getId()+"getCreateDate="+getCreateDate()+"time="+getDate()+
                ", userId='" + userId + '\'' +
                ", pagePicture=" + pagePicture +
                ", cuteComments=" + cuteComments +
                ", commentId='" + commentId + '\'' +
                ", fabulous=" + fabulous +
                ", content='" + content + '\'' +
                '}';
    }
}