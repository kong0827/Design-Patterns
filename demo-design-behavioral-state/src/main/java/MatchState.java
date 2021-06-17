/**
 * @author kxj
 * @date 2021/6/16 12:46 上午
 * @desc
 */
public class MatchState implements TeamState{
    @Override
    public void playGame() {
        System.out.println("全力以赴打比赛");
    }

    @Override
    public TeamState next() {
        return new VocationState();
    }
}
