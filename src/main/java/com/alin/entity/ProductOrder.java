package com.alin.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2019/4/1.
 */
public class ProductOrder implements Serializable {

    private int id;

    private String productName;

    private int price;

    private Date createTime;

    private String trateNo;

    private int userId;

    private String userName;

    public ProductOrder() {
    }

    public ProductOrder(int id, String productName, int price, Date createTime, String trateNo, int userId, String userName) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.createTime = createTime;
        this.trateNo = trateNo;
        this.userId = userId;
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getTrateNo() {
        return trateNo;
    }

    public void setTrateNo(String trateNo) {
        this.trateNo = trateNo;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "ProductOrder{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", createTime=" + createTime +
                ", trateNo='" + trateNo + '\'' +
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                '}';
    }
}
