/**
 * @author kxj
 * @date 2021/6/16 12:50 上午
 * @desc
 */
public class Test {

    public static void main(String[] args) {
        Team team = new Team();
        MatchState matchState = new MatchState();
        team.setTeamState(matchState);
        team.startGame();

        TeamState state = matchState.next();
        team.setTeamState(state);
        team.startGame();
    }
}
