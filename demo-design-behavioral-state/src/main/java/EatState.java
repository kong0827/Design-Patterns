/**
 * @author kxj
 * @date 2021/6/16 12:49 上午
 * @desc
 */
public class EatState implements TeamState{
    @Override
    public void playGame() {
        System.out.println("吃饭中../.....");
    }

    @Override
    public TeamState next() {
        return new MatchState();
    }
}
