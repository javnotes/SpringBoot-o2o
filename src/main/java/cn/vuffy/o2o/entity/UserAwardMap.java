package cn.vuffy.o2o.entity;

import java.util.Date;

/**
 * 顾客已领取的奖品映射
 */

public class UserAwardMap {
    // 主键Id
    private Long userAwardId;
    // 创建时间
    private Date createTime;
    // 使用状态0.未兑换 1.已兑换
    private Integer usedStatus;
    // 领取奖品所消耗的积分
    private Integer point;
    // 顾客信息实体类
    private cn.vuffy.o2o.entity.PersonInfo user;
    // 奖品信息实体类
    private cn.vuffy.o2o.entity.Award award;
    // 店铺信息实体类
    private cn.vuffy.o2o.entity.Shop shop;
    // 操作员信息实体类
    private cn.vuffy.o2o.entity.PersonInfo operator;

    public Long getUserAwardId() {
        return userAwardId;
    }

    public void setUserAwardId(Long userAwardId) {
        this.userAwardId = userAwardId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUsedStatus() {
        return usedStatus;
    }

    public void setUsedStatus(Integer usedStatus) {
        this.usedStatus = usedStatus;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public cn.vuffy.o2o.entity.PersonInfo getUser() {
        return user;
    }

    public void setUser(cn.vuffy.o2o.entity.PersonInfo user) {
        this.user = user;
    }

    public cn.vuffy.o2o.entity.Award getAward() {
        return award;
    }

    public void setAward(cn.vuffy.o2o.entity.Award award) {
        this.award = award;
    }

    public cn.vuffy.o2o.entity.Shop getShop() {
        return shop;
    }

    public void setShop(cn.vuffy.o2o.entity.Shop shop) {
        this.shop = shop;
    }

    public cn.vuffy.o2o.entity.PersonInfo getOperator() {
        return operator;
    }

    public void setOperator(cn.vuffy.o2o.entity.PersonInfo operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "UserAwardMap{" +
                "userAwardId=" + userAwardId +
                ", createTime=" + createTime +
                ", usedStatus=" + usedStatus +
                ", point=" + point +
                ", user=" + user +
                ", award=" + award +
                ", shop=" + shop +
                ", operator=" + operator +
                '}';
    }
}