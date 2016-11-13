package org.seckill.dao;

import org.seckill.entity.Seckill;

import java.util.Date;
import java.util.List;

/**
 * Created by Sheamus on 2016/11/13.
 */
public interface SeckillDao {
    /**
     * 减少库存
     * @param seckillId
     * @param killTime
     * @return
     */
    int reduceNumber(Long seckillId,Date killTime);

    /**
     * 根据Id查询库存
     * @param seckillId
     * @return
     */
    Seckill queryById(Long seckillId);

    /**
     * 根据偏移量查询所有的库存
     * @param offset
     * @param limit
     * @return
     */
    List<Seckill> queryAll(int offset,int limit);
}
