/**
 * @author kxj
 * @date 2021/6/21 12:20 上午
 * @desc 二号观察者
 */
public class RealObserver2 implements Observer {
    @Override
    public void update(String msg) {
        System.out.println("二号观察者：" + msg);
    }
}
