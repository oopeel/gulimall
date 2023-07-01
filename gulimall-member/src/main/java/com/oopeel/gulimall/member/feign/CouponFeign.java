package com.oopeel.gulimall.member.feign;

import com.oopeel.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 这是一个声明式的远程调用
 * @author oopeel
 * @date 2023/7/1
 */
// 目标远程服务
@FeignClient("gulimall-coupon")
public interface CouponFeign {

    @RequestMapping("/coupon/coupon/member/list")
    R memberCoupons();
}
