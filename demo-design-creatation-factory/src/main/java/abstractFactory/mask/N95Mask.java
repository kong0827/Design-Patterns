package abstractFactory.mask;

/**
 * @author kxj
 * @date 2021/5/17 1:15
 * @desc
 */
public class N95Mask extends AbstractMask {

    public N95Mask() {
        this.price = 2;
    }

    @Override
    public void protect() {
        System.out.println("N95口罩的价格---->" + this.price);
    }
}
