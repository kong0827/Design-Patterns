package Cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author kxj
 * @date 2021/6/3 0:48
 * @desc
 */
public class PlayerProxy {

    /**
     * 为任意对象创建代理
     * @param t
     * @param <T>
     * @return
     */
    public static <T> T createProxy(Class<T> t) {
        // 1、创建一个增强器
        Enhancer enhancer = new Enhancer();

        // 2、设置要增强那个类的功能，增强器为这个类动态创建一个子类
        enhancer.setSuperclass(t);

        // 3、设置回调
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("cglib前置增强........");
                // 不能使用method.invoke()会产生死循环
                // method的作用是为了能获取到原方法的一些元数据信息
                // 目标方法进行执行
                Object invoke = methodProxy.invokeSuper(o, objects);
                System.out.println("cglib后置增强........");
                return invoke;
            }
        });
        Object o = enhancer.create();
        return (T) o;
    }
}
