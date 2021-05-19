package com.kxj.adapter.obj;

import com.kxj.impl.MoviePlayer;

/**
 * @author kxj
 * @date 2021/5/19 23:52
 * @desc
 */
public class Test {

    public static void main(String[] args) {
        EnMoviePlayerAdapter adapter = new EnMoviePlayerAdapter(new MoviePlayer());
        adapter.play();
    }
}
