/**
 * @author kxj
 * @date 2021/6/28 23:40
 * @desc
 */
public class Test {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        invoker.setCommand(new TravelCommand());
        invoker.call();
    }
}
