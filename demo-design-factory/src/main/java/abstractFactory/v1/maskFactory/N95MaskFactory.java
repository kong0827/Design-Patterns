package abstractFactory.v1.maskFactory;

import abstractFactory.mask.AbstractMask;
import abstractFactory.mask.N95Mask;
import factoryMethod.car.AbstractCar;

/**
 * @author kxj
 * @date 2021/5/17 1:19
 * @desc
 */
public class N95MaskFactory extends AbstractMaskFactory{
    @Override
    public AbstractMask newMask() {
        return new N95Mask();
    }

    @Override
    public AbstractCar newCar() {
        return null;
    }
}
