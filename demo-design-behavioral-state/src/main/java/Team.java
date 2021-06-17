/**
 * @author kxj
 * @date 2021/6/16 12:51 上午
 * @desc
 */
public class Team {

    private TeamState teamState;

    public void setTeamState(TeamState teamState) {
        this.teamState = teamState;
    }

    public void startGame() {
        // 状态不同导致不同的游戏结果
        teamState.playGame();
    }

    void next() {
        this.teamState = teamState;
    }
}
