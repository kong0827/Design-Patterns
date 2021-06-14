/**
 * @author kxj
 * @date 2021/6/1 0:15
 * @desc
 */
public class MiPhone extends AbstractPhone {

    @Override
    String getPhone() {
        return "小米: " + sale.getSaleInfo();
    }
}
