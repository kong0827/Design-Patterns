/**
 * @author kxj
 * @date 2021/5/18 0:33
 * @desc
 */
public class HuaweiBuilder extends AbstractBuilder{

    public HuaweiBuilder() {
        phone = new Phone();
    }

    @Override
    AbstractBuilder setCpu(String cpu) {
        phone.cpu = cpu;
        return this;
    }

    @Override
    AbstractBuilder setMemory(String memory) {
        phone.memory = memory;
        return this;
    }

    @Override
    AbstractBuilder setDisk(String disk) {
        phone.disk = disk;
        return this;
    }
}
