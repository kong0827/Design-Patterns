package abstractFactory.car;

/**
 * @author kxj
 * @date 2021/5/17 0:52
 * @desc
 */
public class MiniCar  extends AbstractCar {

    public MiniCar() {
        this.engine = "微型发动机";
    }

    @Override
    public void run() {
        System.out.println(this.engine + " --->启动了.....");
    }
}
