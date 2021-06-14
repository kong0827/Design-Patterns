package abstractFactory.car;

/**
 * @author kxj
 * @date 2021/5/17 0:54
 * @desc
 */
public class BigCar  extends AbstractCar {

    public BigCar() {
        this.engine = "大车发动机";
    }

    @Override
    public void run() {
        System.out.println(this.engine + "  ----》 启动了");
    }
}
