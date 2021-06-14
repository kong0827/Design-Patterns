package abstractFactory.v2.maskFactory;

import abstractFactory.factory.AbstractFactory;
import abstractFactory.mask.AbstractMask;
import factoryMethod.car.AbstractCar;

/**
 * @author kxj
 * @date 2021/5/17 1:19
 * @desc
 */
public abstract class AbstractMaskFactory extends AbstractFactory {

    public abstract AbstractMask newMask();

    @Override
    public AbstractCar newCar() {
        return null;
    }
}
