/**
 * @author kxj
 * @date 2021/6/1 0:15
 * @desc
 */
public class Test {

    public static void main(String[] args) {
        AbstractPhone phone = new MiPhone();
        phone.setSale(new OfflineSale("线下", 1999d));
        String s = phone.getPhone();
        System.out.println(s);

        phone.setSale(new OnlineSale("线上", 2999d));
        s = phone.getPhone();
        System.out.println(s);
    }
}
