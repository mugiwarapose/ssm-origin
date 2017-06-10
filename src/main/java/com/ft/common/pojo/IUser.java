package com.ft.common.pojo;

import java.util.Date;

/**
 * Created by cruve on 2017/6/10.
 */
public class IUser {


    private Integer userId;

    private String userNum;

    private String username;

    private String password;

    private Integer active;

    private Integer memberId;

    private  Date  recGenTime;

    private Date recUpdTime;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserNum() {
        return userNum;
    }

    public void setUserNum(String userNum) {
        this.userNum = userNum;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Date getRecGenTime() {
        return recGenTime;
    }

    public void setRecGenTime(Date recGenTime) {
        this.recGenTime = recGenTime;
    }

    public Date getRecUpdTime() {
        return recUpdTime;
    }

    public void setRecUpdTime(Date recUpdTime) {
        this.recUpdTime = recUpdTime;
    }

    @Override
    public String toString() {
        return "IUser{" +
                "userId=" + userId +
                ", userNum='" + userNum + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", active=" + active +
                ", memberId=" + memberId +
                ", recGenTime=" + recGenTime +
                ", recUpdTime=" + recUpdTime +
                '}';
    }
}
