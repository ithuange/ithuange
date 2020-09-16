package com.example.service;

import com.example.entity.CouponGroup;
import java.util.List;

/**
 * (CouponGroup)表服务接口
 *
 * @author makejava
 * @since 2020-09-16 11:38:16
 */
public interface CouponGroupService {

    /**
     * 通过ID查询单条数据
     *
     * @param groupId 主键
     * @return 实例对象
     */
    CouponGroup queryById(Long groupId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<CouponGroup> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param couponGroup 实例对象
     * @return 实例对象
     */
    CouponGroup insert(CouponGroup couponGroup);

    /**
     * 修改数据
     *
     * @param couponGroup 实例对象
     * @return 实例对象
     */
    CouponGroup update(CouponGroup couponGroup);

    /**
     * 通过主键删除数据
     *
     * @param groupId 主键
     * @return 是否成功
     */
    boolean deleteById(Long groupId);

}