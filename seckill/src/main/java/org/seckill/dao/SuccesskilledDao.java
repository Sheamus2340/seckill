package org.seckill.dao;

import org.seckill.entity.Successkilled;

/**
 * Created by Sheamus on 2016/11/13.
 */
public interface SuccesskilledDao {
    /**
     * 添加购买成功的秒杀
     * @param seckillId
     * @param userPhone
     * @return 如果返回的值 > 1表示更新的行数
     * 返回 == 0 说明插入失败
     */
    int insertSuccessKilled(long seckillId,long userPhone);

    /**
     * 根据Id查询出携带库存实体的对象
     * @param seckillId
     * @return
     */
    Successkilled queryByIdWithSeckill(long seckillId);
}
