package com.kxj.adapter.clazz;

import com.kxj.Player;
import com.kxj.impl.Zh_EnTranslator;

/**
 * @author kxj
 * @date 2021/5/19 23:43
 * @desc 继承的方式，类结构模型，适配器装换到翻译器的功能上
 */
public class EnMoviePlayerAdapter extends Zh_EnTranslator implements Player {

    // 被适配的对象
    private Player target;

    public EnMoviePlayerAdapter(Player player) {
        this.target = player;
    }

    @Override
    public String play() {
        String play = target.play();
        // 转换字幕
        String translate = translate(play);
        System.out.println(translate);
        return play;
    }
}
