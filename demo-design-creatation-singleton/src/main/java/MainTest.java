/**
 * @author kxj
 * @date 2021/5/6 23:57
 * @desc
 */
public class MainTest {

    public static void main(String[] args) {
        // 饿汉式/懒汉式/双重检查锁
        Person person1 = Person.getPerson();
        Person person2 = Person.getPerson();
        System.out.println(person1 == person2);

    }
}
