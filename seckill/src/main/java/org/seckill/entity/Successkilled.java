package org.seckill.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Sheamus on 2016/11/13.
 */
public class Successkilled implements Serializable {
    private Long seckillId;
    private Long userPhone;
    private Short state;
    private Date createTime;
    //多对一
    private Seckill seckill;

    public Seckill getSeckill() {
        return seckill;
    }

    public void setSeckill(Seckill seckill) {
        this.seckill = seckill;
    }

    public Long getSeckillId() {
        return seckillId;
    }

    public Long getUserPhone() {
        return userPhone;
    }

    public Short getState() {
        return state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setSeckillId(Long seckillId) {
        this.seckillId = seckillId;
    }

    public void setUserPhone(Long userPhone) {
        this.userPhone = userPhone;
    }

    public void setState(Short state) {
        this.state = state;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Successkilled{" +
                "seckillId=" + seckillId +
                ", userPhone=" + userPhone +
                ", state=" + state +
                ", createTime=" + createTime +
                '}';
    }
}
