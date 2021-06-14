package factoryMethod.factory;

import factoryMethod.car.AbstractCar;
import factoryMethod.car.MiniCar;

/**
 * @author kxj
 * @date 2021/5/17 1:04
 * @desc
 */
public class MiniCarFactory extends AbstractCarFactory {

    @Override
    public AbstractCar newCar() {
        return new MiniCar();
    }
}
