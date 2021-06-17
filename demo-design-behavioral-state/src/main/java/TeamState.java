/**
 * @author kxj
 * @date 2021/6/16 12:45 上午
 * @desc
 */
public interface TeamState {
    /**
     * 玩游戏
     */
    void playGame();

    /**
     * 状态模式的核心，状态由状态机控制
     * 切换到下一个状态
     */
    TeamState next();
}
