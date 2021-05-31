/**
 * @author kxj
 * @date 2021/6/1 0:21
 * @desc
 */
public class Iphone extends AbstractPhone {
    @Override
    String getPhone() {
        return "Iphone：" + sale.getSaleInfo();
    }
}
