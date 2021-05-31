/**
 * @author kxj
 * @date 2021/6/1 0:07
 * @desc 抽象手机类
 * 手机有各个渠道 价格也不同
 */
public abstract class AbstractPhone {

    /**
     * 真正会引起类变化的一个维度直接抽取出来，通过组合的方式桥接起来
     */
    AbstractSale sale;

    /**
     * 手机描述
     */
    abstract String getPhone();

    public void setSale(AbstractSale sale) {
        this.sale = sale;
    }
}
