/**
 * @author kxj
 * @date 2021/5/18 0:30
 * @desc
 */
public abstract class AbstractBuilder {

    Phone phone;

    public Phone getPhone() {
        return phone;
    }

    abstract AbstractBuilder setCpu(String cpu);

    abstract AbstractBuilder setMemory(String memory);

    abstract AbstractBuilder setDisk(String disk);


}
