package com.kxj.strategy;

import java.math.BigDecimal;

/**
 * @author xiangjin.kong
 * @date 2021/4/8 21:57
 * @desc 支付接口 - 策略接口
 */
public interface PayStrategy {

    /**
     * 支付方式
     * @return
     */
    public String getMode();

    /**
     * 支付接口
     * @param price
     */
    void pay(BigDecimal price);
}
