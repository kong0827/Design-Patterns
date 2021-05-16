package abstractFactory.factory;

import abstractFactory.mask.AbstractMask;
import factoryMethod.car.AbstractCar;

/**
 * @author kxj
 * @date 2021/5/17 1:22
 * @desc
 */
public abstract class AbstractFactory {

    public abstract AbstractMask newMask();

    public abstract AbstractCar newCar();
}
