package Cglib;

/**
 * @author kxj
 * @date 2021/6/3 0:55
 * @desc
 */
public class Test {

    public static void main(String[] args) {
        Player proxy = PlayerProxy.createProxy(Player.class);
        proxy.player();
    }
}
