package org.peng.cs.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Order implements Serializable {
    /**
     * 订单编号
     */
    private Integer id;
    /**
     * 订单创建时间
     */
    private String orderTime;
    /**
     * 用户ID
     */
    private Integer userId;
    /**
     * 订单总价
     */
    private Double total;
    /**
     * 用户账号
     */
    private String username;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderTime='" + orderTime + '\'' +
                ", userId=" + userId +
                ", total=" + total +
                ", username='" + username + '\'' +
                '}';
    }

    public Order() {
    }

    public Order(String orderTime,Integer userId,Double total){
        this.orderTime = orderTime;
        this.userId = userId;
        this.total = total;
    }

    public Order(Integer id, String orderTime, Double total, Integer userId,String username) {
        this.id = id;
        this.orderTime = orderTime;
        this.total = total;
        this.userId = userId;
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
