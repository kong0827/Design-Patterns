package simpleFactory;

import org.junit.Test;

/**
 * @author kxj
 * @date 2021/5/17 0:55
 * @desc 简单工厂
 *          1、工厂产品数量少
 */
public class CarFactory {


    public AbstractCar newCar(String type) {
        // 核心方法
        if ("mini".equals(type)) {
            return new MiniCar();
        }
        if ("big".equals(type)) {
            return new MiniCar();
        }
        // ..... 添加
        
        // 更多的产品 违反开闭原则
        return null;
    }

    @Test
    public void test() {
        CarFactory carFactory = new CarFactory();
        AbstractCar mini = carFactory.newCar("mini");
        mini.run();

        AbstractCar big = carFactory.newCar("big");
        big.run();
        
    }
}
