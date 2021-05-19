package com.kxj.adapter.clazz;

import com.kxj.impl.MoviePlayer;

/**
 * @author kxj
 * @date 2021/5/19 23:46
 * @desc
 */
public class Test {

    public static void main(String[] args) {
        EnMoviePlayerAdapter adapter = new EnMoviePlayerAdapter(new MoviePlayer());
        adapter.play();
    }
}
