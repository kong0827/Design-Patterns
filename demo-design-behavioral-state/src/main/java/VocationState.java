/**
 * @author kxj
 * @date 2021/6/16 12:48 上午
 * @desc
 */
public class VocationState implements TeamState{
    @Override
    public void playGame() {
        System.out.println("度假中，饥饿，无心打比赛....");
    }

    @Override
    public TeamState next() {
        return null;
    }
}
