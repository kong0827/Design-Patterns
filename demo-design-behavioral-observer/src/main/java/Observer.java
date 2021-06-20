/**
 * @author kxj
 * @date 2021/6/21 00:11 上午
 * @desc 观察者订阅人对象
 */
public interface Observer {

    /**
     * 接受变动通知
     */
    void update(String msg);
}
