/**
 * @author kxj
 * @date 2021/6/17 12:25 上午
 * @desc
 */
public class SC8633 extends Captain {


    ControlTower tower;

    public void setTower(ControlTower tower) {
        this.tower = tower;
    }

    @Override
    public void fly() {
        System.out.println("SC8633飞机请求起飞.......");
        tower.control("fly");
    }

    @Override
    public void land() {
        System.out.println("SC8633飞机请求着陆.......");
        tower.control("land");
    }

    @Override
    public void success() {
        System.out.println("SC8633飞机请求完成.......");
        tower.control("success");
    }
}
