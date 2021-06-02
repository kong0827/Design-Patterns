/**
 * @author kxj
 * @date 2021/6/2 23:18
 * @desc
 */
public class EnMoviePlayerDecorator implements MoviePlayerDecorator {

    private MoviePlayer moviePlayer;

    /**
     * 被装饰的方法
     * @param moviePlayer
     */
    public EnMoviePlayerDecorator(MoviePlayer moviePlayer) {
        this.moviePlayer = moviePlayer;
    }

    @Override
    public void play() {
        decorator();
        moviePlayer.play();
    }

    @Override
    public void decorator() {
        System.out.println("播放字幕。。。。。");
    }
}
