package abstractFactory.v1.carFactory;

import abstractFactory.mask.AbstractMask;
import factoryMethod.car.AbstractCar;
import factoryMethod.car.BigCar;

/**
 * @author kxj
 * @date 2021/5/17 1:02
 * @desc
 */
public class BigCarFactory extends AbstractCarFactory {
    @Override
    public AbstractMask newMask() {
        return null;
    }

    @Override
    public AbstractCar newCar() {
        return new BigCar();
    }
}
