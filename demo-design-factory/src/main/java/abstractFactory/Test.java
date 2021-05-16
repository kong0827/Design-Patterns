package abstractFactory;

import abstractFactory.v1.carFactory.MiniCarFactory;
import abstractFactory.factory.AbstractFactory;
import abstractFactory.mask.AbstractMask;
import abstractFactory.v1.maskFactory.N95MaskFactory;
import factoryMethod.car.AbstractCar;

/**
 * @author kxj
 * @date 2021/5/17 1:24
 * @desc
 */
public class Test {

    public static void main(String[] args) {
        AbstractFactory miniCarFactory = new MiniCarFactory();
        AbstractCar car = miniCarFactory.newCar();
        car.run();

        AbstractFactory maskFactory = new N95MaskFactory();
        AbstractMask abstractMask = maskFactory.newMask();
        abstractMask.protect();

    }
}
