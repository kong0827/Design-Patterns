package com.kxj.impl;

import com.kxj.Player;

/**
 * @author kxj
 * @date 2021/5/19 23:20
 * @desc
 */
public class MoviePlayer implements Player {

    @Override
    public String play() {
        System.out.println("正在播放中。。。。。");
        String content = "你好";
        return content;
    }
}
