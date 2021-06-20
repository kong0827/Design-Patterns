/**
 * @author kxj
 * @date 2021/6/17 12:24 上午
 * @desc
 */
public abstract class Captain {

    public ControlTower tower;

    public void setTower(ControlTower tower) {
        this.tower = tower;
    }

    public abstract void fly();

    public abstract void land();

    public abstract void success();
}
