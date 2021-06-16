
/**
 * @author kxj
 * @date 2021/6/16 12:00 上午
 * @desc
 */
public abstract class CookTemplate {

    /**
     * 定义算法: 定义好了模板
     * 父类可以实现某些步骤
     * 留关键步骤给子类实现
     */
    public void cook(String name) {
        // 定义算法步骤
        heating();
        addFood(name);
        addSalt();
        stratify();
        end();
    }

    protected void end() {
        System.out.println("出锅.....");
    }

    protected void stratify() {
        System.out.println("翻炒中......");
    }

    protected abstract void addSalt();

    protected abstract void addFood(String name);

    protected abstract void heating();

}
