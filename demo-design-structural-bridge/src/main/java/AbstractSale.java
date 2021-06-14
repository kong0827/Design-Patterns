/**
 * @author kxj
 * @date 2021/6/1 0:08
 * @desc
 */
public abstract class AbstractSale {

    private String type;
    private double price;

    public AbstractSale() {
    }

    public AbstractSale(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public String getSaleInfo() {
        return "渠道：" + type + "===》 价格：" + price;
    }
}
