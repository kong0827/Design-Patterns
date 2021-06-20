/**
 * @author kxj
 * @date 2021/6/21 00:10 上午
 * @desc 订阅者主题对象
 */
public interface Subject {

    /**
     * 订阅操作
     *
     * @param observer
     */
    void attach(Observer observer);

    /**
     * 取消订阅
     */
    void detach(Observer observer);

    /**
     * 通知变动
     */

    void notifyChanged(String msg);
}
