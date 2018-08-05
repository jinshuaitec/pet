package com.love.team.pet.model;

import java.util.Date;

public class ReleaseInformation extends BaseEntity {
    private Boolean isDeleted;

    private Integer totalPoint;

    private String title;

    private Integer heat;

    private Integer readAmount;

    private String auditor;

    /**
     * 初试状态为0,审核通过为1,没有通过为-1,已被领养为2
     */
    private Integer status;

    private Date auditDate;

    private String content;

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Integer getTotalPoint() {
        return totalPoint;
    }

    public void setTotalPoint(Integer totalPoint) {
        this.totalPoint = totalPoint;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getHeat() {
        return heat;
    }

    public void setHeat(Integer heat) {
        this.heat = heat;
    }

    public Integer getReadAmount() {
        return readAmount;
    }

    public void setReadAmount(Integer readAmount) {
        this.readAmount = readAmount;
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(Date auditDate) {
        this.auditDate = auditDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}