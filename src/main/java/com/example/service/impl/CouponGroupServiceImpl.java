package com.example.service.impl;

import com.example.entity.CouponGroup;
import com.example.dao.CouponGroupDao;
import com.example.service.CouponGroupService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (CouponGroup)表服务实现类
 *
 * @author makejava
 * @since 2020-09-16 11:38:17
 */
@Service("couponGroupService")
public class CouponGroupServiceImpl implements CouponGroupService {
    @Resource
    private CouponGroupDao couponGroupDao;

    /**
     * 通过ID查询单条数据
     *
     * @param groupId 主键
     * @return 实例对象
     */
    @Override
    public CouponGroup queryById(Long groupId) {
        return this.couponGroupDao.queryById(groupId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<CouponGroup> queryAllByLimit(int offset, int limit) {
        return this.couponGroupDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param couponGroup 实例对象
     * @return 实例对象
     */
    @Override
    public CouponGroup insert(CouponGroup couponGroup) {
        this.couponGroupDao.insert(couponGroup);
        return couponGroup;
    }

    /**
     * 修改数据
     *
     * @param couponGroup 实例对象
     * @return 实例对象
     */
    @Override
    public CouponGroup update(CouponGroup couponGroup) {
        this.couponGroupDao.update(couponGroup);
        return this.queryById(couponGroup.getGroupId());
    }

    /**
     * 通过主键删除数据
     *
     * @param groupId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long groupId) {
        return this.couponGroupDao.deleteById(groupId) > 0;
    }
}