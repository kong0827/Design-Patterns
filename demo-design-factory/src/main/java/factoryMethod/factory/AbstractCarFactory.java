package factoryMethod.factory;

import factoryMethod.car.AbstractCar;

/**
 * @author kxj
 * @date 2021/5/17 1:01
 * @desc 简单工厂  每个工厂生产指定型号的车
 */
public abstract class AbstractCarFactory {

    public abstract AbstractCar newCar();

}
