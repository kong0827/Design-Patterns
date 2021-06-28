/**
 * @author kxj
 * @date 2021/6/28 23:35
 * @desc 抽象命令类
 * Controller, Service, Dao接口
 */
public interface Command {

    /**
     * 命令的执行方法
     */
    void execute();
}
