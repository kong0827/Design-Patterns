package statics;

/**
 * @author kxj
 * @date 2021/6/2 23:47
 * @desc
 */
public class Test {

    public static void main(String[] args) {
        MoviePlayerProxy moviePlayerProxy = new MoviePlayerProxy(new EnMoviePlayer());
        moviePlayerProxy.player();
    }
}
