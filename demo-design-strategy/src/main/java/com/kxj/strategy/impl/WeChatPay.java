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
    public String getMode() {
        return "weChat";
    }

    public void pay(BigDecimal price) {
        log.info("使用微信支付：{}", price);
    }
}
