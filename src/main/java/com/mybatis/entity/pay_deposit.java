package com.mybatis.entity;

import java.io.Serializable;
import java.util.Date;

public class pay_deposit implements Serializable {
    private Integer id;

    private Integer userId;

    private String phone;

    private String name;

    private String identificationCard;

    private Integer type;

    private Double price;

    private Integer way;

    private Date time;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIdentificationCard() {
        return identificationCard;
    }

    public void setIdentificationCard(String identificationCard) {
        this.identificationCard = identificationCard == null ? null : identificationCard.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getWay() {
        return way;
    }

    public void setWay(Integer way) {
        this.way = way;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}