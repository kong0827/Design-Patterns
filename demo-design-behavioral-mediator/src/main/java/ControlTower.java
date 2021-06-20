/**
 * @author kxj
 * @date 2021/6/17 12:28 上午
 * @desc 中介者
 */
public class ControlTower {

    boolean canDo = true;

    public void control(String action) {
        if ("fly".equals(action) || "land".equals(action)) {
            if (canDo) {
                System.out.println("允许起飞");
                canDo = false;
            } else {
                System.out.println("不允许起飞");
            }
        }
        if ("success".equals(action)) {
            System.out.println("结束");
            canDo = true;
        }
    }
}
