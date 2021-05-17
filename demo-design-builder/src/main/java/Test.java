/**
 * @author kxj
 * @date 2021/5/18 0:35
 * @desc
 */
public class Test {

    public static void main(String[] args) {
        AbstractBuilder abstractBuilder = new HuaweiBuilder();

        Phone phone = abstractBuilder.setCpu("骁龙888").setMemory("16G").setDisk("512G").getPhone();
        System.out.println(phone);
    }
}
