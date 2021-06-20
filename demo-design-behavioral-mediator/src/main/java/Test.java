/**
 * @author kxj
 * @date 2021/6/17 12:35 上午
 * @desc
 */
public class Test {

    public static void main(String[] args) {
        HN9090 hn9090 = new HN9090();
        SC8633 sc8633 = new SC8633();
        ControlTower tower = new ControlTower();
        hn9090.setTower(tower);
        sc8633.setTower(tower);
        hn9090.fly();
        hn9090.success();
        sc8633.fly();
    }
}
