package org.atomic.coder.design_pattern._2_structuralpattern._7_Proxy_pattern._2_dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 80340897
 * @date 2021/8/25 14:31
 *
 * 注意，该方法在Proxy类中是静态方法，且接收的三个参数依次为：
 *
 * ClassLoader loader：指定当前目标对象使用类加载器，获取加载器的方法是固定的。
 * Class<?>[] interfaces：目标对象实现的接口类型，使用泛型方式确认类型。
 * InvocationHandler h：事件处理。执行目标对象的方法时，会触发事件处理器的方法，会把当前执行目标对象的方法作为参数传入。
 *
 */
public class ProxyFactory {

    /**
     * 维护一个目标对象
     */
    private Object target;

    /**
     * 对象构造时，提供目标对象
     */
    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * 给目标对象生成代理对象
     */
    public Object getProxyInstance() {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("Begin Transaction");
                        //执行目标对象方法
                        Object returnValue = method.invoke(target, args);
                        System.out.println("Commit Transaction");
                        return returnValue;
                    }
                }
        );
    }

}
