package com.kxj.impl;

import com.kxj.Translator;

/**
 * @author kxj
 * @date 2021/5/19 23:39
 * @desc
 */
public class Zh_EnTranslator implements Translator {
    @Override
    public String translate(String content) {
        return "将【" + content + "】进行翻译，翻译结果为：Hello";
    }
}
