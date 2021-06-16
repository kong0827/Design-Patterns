package com.kxj.demo02;

/**
 * @author kxj
 * @date 2021/6/16 12:30 上午
 * @desc 上下文类
 */
public class GameContext {

    private GameStrategy gameStrategy;

    public void setGameStrategy(GameStrategy gameStrategy) {
        this.gameStrategy = gameStrategy;
    }

    public void startGame() {
        System.out.println("开始游戏....");
        gameStrategy.warStrategy();
        System.out.println("胜利....");
    }
}
