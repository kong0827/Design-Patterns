import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author kxj
 * @date 2021/6/14 8:53 下午
 * @desc
 * 足道店：这相当于享元工厂，店里面很多服务员
 *
 * 享元和原型
 * 1、享元返回的是这个本人
 * 2、原型返回的是克隆人
 */
public class ZuDao {

    private static Map<String, AbstractWaitressFlyweight> pool = new HashMap<>(16);

    // 享元，池子中有对象
    static {
        BeautifulWaitress waitress1 = new BeautifulWaitress("1", "张三", 18);
        BeautifulWaitress waitress2 = new BeautifulWaitress("2", "李四", 20);
        BeautifulWaitress waitress3 = new BeautifulWaitress("3", "王五", 21);
        pool.put(waitress1.id, waitress1);
        pool.put(waitress2.id, waitress2);
        pool.put(waitress3.id, waitress3);
    }

    public void addWaitress(AbstractWaitressFlyweight waitressFlyweight) {
        pool.put(UUID.randomUUID().toString(), waitressFlyweight);
    }

    public static AbstractWaitressFlyweight getWaitress(String name) {
        AbstractWaitressFlyweight flyweight = pool.get(name);
        if (flyweight == null) {
            for (AbstractWaitressFlyweight value : pool.values()) {
                if (value.isCanService()) {
                    return value;
                }
            }
            return null;
        }
        if (!flyweight.isCanService()) {
            return null;
        }
        return flyweight;
    }
}
