package com.kxj.adapter.obj;

import com.kxj.Player;
import com.kxj.Translator;
import com.kxj.impl.Zh_EnTranslator;

/**
 * @author kxj
 * @date 2021/5/19 23:43
 * @desc 组合的方式：对象结构模型，适配转换到了翻译器的功能上
 */
public class EnMoviePlayerAdapter implements Player {

    private Translator translator = new Zh_EnTranslator();
    // 被适配的对象
    private Player target;

    public EnMoviePlayerAdapter(Player player) {
        this.target = player;
    }

    @Override
    public String play() {
        String play = target.play();
        // 转换字幕
        String translate = translator.translate(play);
        System.out.println(translate);
        return play;
    }
}
