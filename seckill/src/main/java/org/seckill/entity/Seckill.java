package org.seckill.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Sheamus on 2016/11/13.
 */
public class Seckill implements Serializable {
    private Long seckillId;
    private String name;
    private Integer number;
    private Date startTime;
    private Date endTime;
    private Date createTime;

    public Long getSeckillId() {
        return seckillId;
    }

    public String getName() {
        return name;
    }

    public Integer getNumber() {
        return number;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setSeckillId(Long seckillId) {
        this.seckillId = seckillId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Seckill{" +
                "seckillId=" + seckillId +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", createTime=" + createTime +
                '}';
    }
}
