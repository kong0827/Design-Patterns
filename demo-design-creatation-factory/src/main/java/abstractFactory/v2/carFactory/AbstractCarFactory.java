package abstractFactory.v2.carFactory;

import abstractFactory.factory.AbstractFactory;
import abstractFactory.mask.AbstractMask;
import factoryMethod.car.AbstractCar;

/**
 * @author kxj
 * @date 2021/5/17 1:01
 * @desc 简单工厂  每个工厂生产指定型号的车
 */
public abstract class AbstractCarFactory extends AbstractFactory {

    public abstract AbstractCar newCar();

    @Override
    public AbstractMask newMask() {
        return null;
    }
}
