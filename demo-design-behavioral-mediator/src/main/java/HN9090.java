/**
 * @author kxj
 * @date 2021/6/17 12:30 上午
 * @desc
 */
public class HN9090 extends Captain {

    ControlTower tower;

    public void setTower(ControlTower tower) {
        this.tower = tower;
    }

    @Override
    public void fly() {
        System.out.println("HN9090飞机请求起飞.......");
        tower.control("fly");
    }

    @Override
    public void land() {
        System.out.println("HN9090飞机请求着陆.......");
        tower.control("land");
    }

    @Override
    public void success() {
        System.out.println("完成.......");
        tower.control("success");
    }
}
