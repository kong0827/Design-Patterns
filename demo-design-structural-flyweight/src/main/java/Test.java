/**
 * @author kxj
 * @date 2021/6/14 9:00 下午
 * @desc
 */
public class Test {

    public static void main(String[] args) {

        AbstractWaitressFlyweight waitress1 = ZuDao.getWaitress("");
        waitress1.service();
        System.out.println(waitress1);

        AbstractWaitressFlyweight waitress2 = ZuDao.getWaitress("");
        waitress2.service();
        System.out.println(waitress2);

        AbstractWaitressFlyweight waitress3 = ZuDao.getWaitress("3");
        waitress3.service();
        System.out.println(waitress3);

        waitress1.end();
        AbstractWaitressFlyweight waitress = ZuDao.getWaitress("1");
        waitress.service();

    }
}
