package com.example.controller;

import com.example.entity.CouponGroup;
import com.example.service.CouponGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (CouponGroup)表控制层
 *
 * @author makejava
 * @since 2020-09-16 11:38:17
 */
@RestController
@RequestMapping("couponGroup")
public class CouponGroupController {
    @Autowired
    private CouponGroupService couponGroupService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public CouponGroup selectOne(Long id) {
        return this.couponGroupService.queryById(id);
    }

}