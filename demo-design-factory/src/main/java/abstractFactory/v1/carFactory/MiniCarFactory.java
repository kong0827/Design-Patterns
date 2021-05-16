package abstractFactory.v1.carFactory;

import abstractFactory.mask.AbstractMask;
import factoryMethod.car.AbstractCar;
import factoryMethod.car.MiniCar;

/**
 * @author kxj
 * @date 2021/5/17 1:04
 * @desc
 */
public class MiniCarFactory extends AbstractCarFactory {

    @Override
    public AbstractMask newMask() {
        return null;
    }

    @Override
    public AbstractCar newCar() {
        return new MiniCar();
    }
}
