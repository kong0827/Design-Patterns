package dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author kxj
 * @date 2021/6/3 0:31
 * @desc
 */
public class JdkMoviePlayerProxy<T> implements InvocationHandler {

    private T target;

    public JdkMoviePlayerProxy(T target) {
        this.target = target;
    }

    public static <T> T getProxy(T t) {
        /**
         *
         *   ClassLoader loader   当前被代理对象的类加载器
         *   Class<?>[] interfaces 当前被代理对象所实现的接口
         *   InvocationHandler h 当前被代理对象执行目标方法的时候使用h可以自定义拦截增强方法
         */
        Object o = Proxy.newProxyInstance(t.getClass().getClassLoader(),
                t.getClass().getInterfaces(),
                new JdkMoviePlayerProxy(t));
        return (T) o;
    }

    /**
     * 定义的拦截方法，每个方法都会进入
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("jdk动态代理前置拦截方法............");
        Object o = method.invoke(target, args);
        System.out.println("jdk动态代理后置拦截方法............");
        return o;
    }
}
