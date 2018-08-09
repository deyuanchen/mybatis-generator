package com.mybatis.entity;

import java.io.Serializable;
import java.util.Date;

public class WxRankingFlow implements Serializable {
    private Integer id;

    private Integer businessRiderDeposit;

    private Integer professionalRiderDeposit;

    private Integer score;

    private Integer second;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBusinessRiderDeposit() {
        return businessRiderDeposit;
    }

    public void setBusinessRiderDeposit(Integer businessRiderDeposit) {
        this.businessRiderDeposit = businessRiderDeposit;
    }

    public Integer getProfessionalRiderDeposit() {
        return professionalRiderDeposit;
    }

    public void setProfessionalRiderDeposit(Integer professionalRiderDeposit) {
        this.professionalRiderDeposit = professionalRiderDeposit;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getSecond() {
        return second;
    }

    public void setSecond(Integer second) {
        this.second = second;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}