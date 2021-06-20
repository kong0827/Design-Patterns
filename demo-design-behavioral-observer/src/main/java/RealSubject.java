import java.util.ArrayList;
import java.util.List;

/**
 * @author kxj
 * @date 2021/6/21 00:13 上午
 * @desc
 */
public class RealSubject implements Subject{

    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyChanged(String msg) {
        for (Observer observer : observerList) {
            observer.update(msg);
        }
    }
}
