package abstractFactory.v1.maskFactory;

import abstractFactory.factory.AbstractFactory;
import abstractFactory.mask.AbstractMask;

/**
 * @author kxj
 * @date 2021/5/17 1:19
 * @desc
 */
public abstract class AbstractMaskFactory extends AbstractFactory {

    public abstract AbstractMask newMask();
}
