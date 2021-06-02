/**
 * @author kxj
 * @date 2021/6/2 23:20
 * @desc
 */
public class Test {

    public static void main(String[] args) {
        // 核心：想要不改变原来接口方法的情况下扩展新功能，或者增强方法.....
        MoviePlayer moviePlayer = new EnMoviePlayer();
        MoviePlayerDecorator moviePlayerDecorator = new EnMoviePlayerDecorator(moviePlayer);
        moviePlayerDecorator.play();

    }
}
