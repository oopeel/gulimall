package com.oopeel.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.oopeel.common.utils.PageUtils;
import com.oopeel.gulimall.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author oopeel
 * @email oopeel@163.com
 * @date 2023-07-01 16:54:26
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

