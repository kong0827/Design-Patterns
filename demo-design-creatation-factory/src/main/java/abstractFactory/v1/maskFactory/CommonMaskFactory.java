package abstractFactory.v1.maskFactory;

import abstractFactory.mask.AbstractMask;
import abstractFactory.mask.CommonMask;
import factoryMethod.car.AbstractCar;

/**
 * @author kxj
 * @date 2021/5/17 1:20
 * @desc
 */
public class CommonMaskFactory extends AbstractMaskFactory{
    @Override
    public AbstractMask newMask() {
        return new CommonMask();
    }

    @Override
    public AbstractCar newCar() {
        return null;
    }
}
