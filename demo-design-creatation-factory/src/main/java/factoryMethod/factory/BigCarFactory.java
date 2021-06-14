package factoryMethod.factory;

import factoryMethod.car.AbstractCar;
import factoryMethod.car.BigCar;

/**
 * @author kxj
 * @date 2021/5/17 1:02
 * @desc
 */
public class BigCarFactory extends AbstractCarFactory {
    @Override
    public AbstractCar newCar() {
        return new BigCar();
    }
}
