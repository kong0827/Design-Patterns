/**
 * @author kxj
 * @date 2021/6/16 12:00 上午
 * @desc
 */
public class AutoCookMachine extends CookTemplate{
    @Override
    protected void addSalt() {
        System.out.println("添加食盐.....");
    }

    @Override
    protected void addFood(String name) {
        System.out.println("添加食物:" + name + ".....");
    }

    @Override
    protected void heating() {
        System.out.println("开火.....");
    }
}
