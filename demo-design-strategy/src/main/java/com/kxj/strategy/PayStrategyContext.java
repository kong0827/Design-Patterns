package com.kxj.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author xiangjin.kong
 * @date 2021/4/8 22:05
 * @desc 创建上下文管理，用于提取策略
 * @autowired注解放的位置和对应的参数列表了吗？实际上它还可以注入到Map和List，Map的key就是它注入时的名，List则是存放全部实例对象
 */
@Component
public class PayStrategyContext {

//    @Autowired
//    List<PayStrategy> payStrategyList;
//
//    @Autowired
//    Map<String, PayStrategy> payStrategyMap;

    private final Map<String, PayStrategy> strategyMap = new ConcurrentHashMap<String, PayStrategy>();

    /**
     * 构造函数，把spring容器中所有关于该接口的子类，全部放入到集合中
     * @param payStrategyList
     */
    public PayStrategyContext(List<PayStrategy> payStrategyList) {
        for (PayStrategy payStrategy : payStrategyList) {
            strategyMap.put(payStrategy.getMode(), payStrategy);
        }
    }




    public void useStrategy(String mode, BigDecimal price) {
        PayStrategy strategy = this.strategyMap.get(mode);
        if (strategy == null) {
            throw new RuntimeException("支付方式有误，请检查");
        }
        strategy.pay(price);
    }
}
