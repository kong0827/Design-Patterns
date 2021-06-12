/**
 * @author kxj
 * @date 2021/6/12 11:37 下午
 * @desc
 */
public class WechatFacade {

    Police police = new Police();
    Edu edu = new Edu();
    Social social = new Social();

    /**
     * 封装起来只留一个方法
     * @param name
     */
    public void handler(String name) {
        police.register(name);
        edu.assignSchool(name);
        social.handlerSocial(name);
    }
}
