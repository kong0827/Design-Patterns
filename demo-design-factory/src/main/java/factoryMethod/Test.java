package factoryMethod;

import factoryMethod.car.AbstractCar;
import factoryMethod.car.MiniCar;
import factoryMethod.factory.AbstractCarFactory;
import factoryMethod.factory.BigCarFactory;
import factoryMethod.factory.MiniCarFactory;

/**
 * @author kxj
 * @date 2021/5/17 1:04
 * @desc
 */
public class Test {

    public static void main(String[] args) {
        BigCarFactory bigCarFactory = new BigCarFactory();
        AbstractCar bigCar = bigCarFactory.newCar();
        bigCar.run();

        MiniCarFactory miniCarFactory = new MiniCarFactory();
        AbstractCar miniCar = miniCarFactory.newCar();
        miniCar.run();
    }

}
