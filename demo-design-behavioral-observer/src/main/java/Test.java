/**
 * @author kxj
 * @date 2021/6/21 00:15 上午
 * @desc
 */
public class Test {

    public static void main(String[] args) {
        Subject subject = new RealSubject();
        Observer observer = new RealObserver();
        subject.attach(observer);
        subject.attach(new RealObserver2());
        subject.notifyChanged("下班了....");
    }
}
