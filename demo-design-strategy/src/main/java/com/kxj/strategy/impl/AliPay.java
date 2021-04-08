package com.kxj.strategy.impl;

import com.kxj.strategy.PayStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @author xiangjin.kong
 * @date 2021/4/8 22:00
 * @desc 支付宝支付
 */
@Slf4j
@Component
public class AliPay implements PayStrategy {

    public String getMode() {
        return "aliPay";
    }

    public void pay(BigDecimal price) {
        log.info("使用支付宝支付：{}", price);
    }
}
