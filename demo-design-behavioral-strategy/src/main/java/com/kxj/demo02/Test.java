package com.kxj.demo02;

/**
 * @author kxj
 * @date 2021/6/16 12:29 上午
 * @desc
 */
public class Test {
    public static void main(String[] args) {
        GameContext context = new GameContext();
        context.setGameStrategy(new SteadyStrategy());
        context.startGame();
    }
}
