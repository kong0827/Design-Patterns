package abstractFactory.mask;

/**
 * @author kxj
 * @date 2021/5/17 1:17
 * @desc
 */
public class CommonMask extends AbstractMask {

    public CommonMask() {
        this.price = 1;
    }

    @Override
    public void protect() {
        System.out.println("普通口罩的价格---->" + this.price);
    }
}
