package dynamic;

/**
 * @author kxj
 * @date 2021/6/3 0:38
 * @desc
 */
public class Test {
    public static void main(String[] args) {
        MoviePlayer moviePlayer = new EnPlayer();
        MoviePlayer proxy = JdkMoviePlayerProxy.getProxy(moviePlayer);
        proxy.player();
        /*
         * 动态代理模式：
         * JDK要求被代理对象必须有接口
         *
         * 代理对象和目标对象的相同点在于都是同一个接口
         */
        System.out.println("------------");
        ((AdvertisingPlayer)proxy).playAd();
    }
}
