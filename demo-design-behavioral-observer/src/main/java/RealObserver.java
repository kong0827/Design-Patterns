/**
 * @author kxj
 * @date 2021/6/21 00:14 上午
 * @desc
 */
public class RealObserver implements Observer {
    @Override
    public void update(String msg) {
        System.out.println("一号观察者：" + msg);
    }
}
