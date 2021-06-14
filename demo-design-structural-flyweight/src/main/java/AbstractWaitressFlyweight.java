/**
 * @author kxj
 * @date 2021/6/14 8:46 下午
 * @desc 可共享和不共享状态
 */
public abstract class AbstractWaitressFlyweight {

    // 能否服务
    boolean canService = true;

    // 正在服务  享元的不可共享属性留给外部进行改变的接口
    abstract void service();

    // 服务完成  享元额不可共享属性留给外部进行改变的接口
    abstract void end();

    public boolean isCanService() {
        return canService;
    }
}
