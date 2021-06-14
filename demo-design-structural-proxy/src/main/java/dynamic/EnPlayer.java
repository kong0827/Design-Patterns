package dynamic;

/**
 * @author kxj
 * @date 2021/6/2 23:44
 * @desc
 */
public class EnPlayer implements MoviePlayer, AdvertisingPlayer {
    @Override
    public void player() {
        System.out.println("播放电影............");
    }

    @Override
    public void playAd() {
        System.out.println("播放广告............");
    }
}
