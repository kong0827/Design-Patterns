import lombok.Data;

/**
 * @author kxj
 * @date 2021/5/6 23:54
 * @desc
 */
@Data
public class Person {

    private String name;
    private int age;

//    /**
//     * 饿汉式
//     */
//    private static Person person = new Person;
//
//    /**
//     * 构造器私有
//     */
//    private Person() {
//    }
//
//    public static Person getPerson() {
//        return person;
//    }

    /**
     * 懒汉式
     */
//    private static Person person;
//
//    private Person() {
//    }
//
//    public static Person getPerson() {
//        if (person == null) {
//            person =  new Person();
//        }
//        return person;
//    }

    /**
     * 双重检查锁 + volatile
     *
     * 双重检验锁是对同步块加锁的方法。为什么会称为双重检验,因为有两次对 instance == null的检查，一次中同步块中一次中同步块外部。
     *
     * 对于两次instance的是否为空的判断解释：
     *
     * 1.为何在synchronization外面的判断？
     *
     *        为了提高性能！如果拿掉这次的判断那么在行的时候就会直接的运行synchronization，所以这会使每个getInstance()都会得到一个静态内部锁，这样的话锁的获得以及释放的开销（包括上下文切换，内存同步等）都不可避免，降低了效率。所以在synchronization前面再加一次判断是否为空，则会大大降低synchronization块的执行次数。
     *
     * 2.为何在synchronization内部还要执行一次呢？
     *
     * 因为可能会有多个线程一起进入同步块外的 if，如果在同步块内不进行二次检验的话就会生成多个实例了。
     *
     *
     * PS：双重检验情况下，保存实例的唯一的静态变量要用volatile修饰，否则由于线程安全原因，一个类仍然有会生成多个实例。
     *
     * 3、volatile 的作用
     * 主要是禁止重排序，初始化一个实例（SomeType st = new SomeType()）在java字节码中会有4个步骤，
     * 申请内存空间，
     * 初始化默认值（区别于构造器方法的初始化），
     * 执行构造器方法连接引用和实例。
     * 这4个步骤后两个有可能会重排序，1234  1243都有可能，造成未初始化完全的对象发布。volatile可以禁止指令重排序，从而避免这个问题。
     *
     */
    private volatile static Person person;

    public static Person getPerson() {
        if (person == null) {
            synchronized (Person.class) {
                if (person == null) {
                    person = new Person();
                }
            }
        }
        return person;
    }


}
