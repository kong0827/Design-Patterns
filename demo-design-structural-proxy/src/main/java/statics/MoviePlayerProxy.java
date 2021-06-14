package statics;

/**
 * @author kxj
 * @date 2021/6/2 23:46
 * @desc
 */
public class MoviePlayerProxy implements MoviePlayer {

    private MoviePlayer moviePlayer;

    public MoviePlayerProxy(MoviePlayer moviePlayer) {
        this.moviePlayer = moviePlayer;
    }

    @Override
    public void player() {
        System.out.println("代理方法");
        moviePlayer.player();
    }
}
