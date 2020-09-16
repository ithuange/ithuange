package com.example.dao;

import com.example.entity.CouponGroup;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (CouponGroup)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-16 11:38:15
 */
public interface CouponGroupDao {

    /**
     * 通过ID查询单条数据
     *
     * @param groupId 主键
     * @return 实例对象
     */
    CouponGroup queryById(Long groupId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<CouponGroup> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param couponGroup 实例对象
     * @return 对象列表
     */
    List<CouponGroup> queryAll(CouponGroup couponGroup);

    /**
     * 新增数据
     *
     * @param couponGroup 实例对象
     * @return 影响行数
     */
    int insert(CouponGroup couponGroup);

    /**
     * 修改数据
     *
     * @param couponGroup 实例对象
     * @return 影响行数
     */
    int update(CouponGroup couponGroup);

    /**
     * 通过主键删除数据
     *
     * @param groupId 主键
     * @return 影响行数
     */
    int deleteById(Long groupId);

}