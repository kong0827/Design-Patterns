package com.kxj.controller;

import com.kxj.strategy.PayStrategyContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @author kxj
 * @date 2021/4/11 16:51
 * @desc
 */
@RestController
public class PayController {

    @Autowired
    PayStrategyContext context;

    @GetMapping
    public void test(@RequestParam(value = "mode") String mode) {
        context.useStrategy(mode, new BigDecimal(10));
    }
}
