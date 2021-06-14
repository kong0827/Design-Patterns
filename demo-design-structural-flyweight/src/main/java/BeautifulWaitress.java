import lombok.AllArgsConstructor;

/**
 * @author kxj
 * @date 2021/6/14 8:50 下午
 * @desc
 */
@AllArgsConstructor
public class BeautifulWaitress extends AbstractWaitressFlyweight {

    String id;
    String name;
    int age;

    @Override
    void service() {
        System.out.println("工号："+id+";"+name+" "+ age+" 正在为您服务....");
        // 改变外部状态
        this.canService = false;
    }

    @Override
    void end() {
        System.out.println("工号：" + id + "; " + name + " " + age + " 服务结束...请给五星好评");
        this.canService = true;
    }
}
