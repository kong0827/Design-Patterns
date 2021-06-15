package com.kxj.strategy.impl;

import com.kxj.strategy.PayStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @author xiangjin.kong
 * @date 2021/4/8 22:04
 * @desc 微信支付
 */
@Slf4j
@Component
public class WeChatPay implements PayStrategy {
    @Override
    public String getMode() {
        return "weChat";
    }

    @Override
    public void pay(BigDecimal price) {
        log.info("一大堆业务代码.....");
        log.info("微信支付，支付了{}元", price);
    }
}
